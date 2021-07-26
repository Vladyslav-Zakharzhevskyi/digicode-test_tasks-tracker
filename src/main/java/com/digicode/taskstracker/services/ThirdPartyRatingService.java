package com.digicode.taskstracker.services;

import com.digicode.taskstracker.dto.RatingDto;

public interface ThirdPartyRatingService {
  RatingDto getTaskRating(Long taskId);
}
