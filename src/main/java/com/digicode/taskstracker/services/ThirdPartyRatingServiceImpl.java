package com.digicode.taskstracker.services;

import com.digicode.taskstracker.dto.RatingDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Optional;

@Service
public class ThirdPartyRatingServiceImpl implements ThirdPartyRatingService {

  public static final String RATING_API_ENDPOINT = "http://localhost:8080/digicode/companyRaiting/getCompanyStat";

  @Override
  public RatingDto getTaskRating(Long taskId) {
    Optional<RatingDto> ratingDto;
    try {
      RestTemplate restTemplate = new RestTemplate();
      ratingDto = Optional.ofNullable(restTemplate.getForObject(RATING_API_ENDPOINT, RatingDto.class));
    } catch (HttpServerErrorException.ServiceUnavailable ex) {
      ratingDto = Optional.empty();
    }

    return ratingDto.orElseGet(this::getDefaultRating);
  }

  private RatingDto getDefaultRating() {
    return new RatingDto(0.0, 0, Collections.emptyList());
  }

}
