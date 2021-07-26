package com.digicode.taskstracker.dto;

import com.digicode.taskstracker.entity.User;

import java.util.List;

public class RatingDto {

  private double averageRating;

  private int countVotes;

  private List<User> voters;

  public RatingDto(double averageRating, int countVotes, List<User> voters) {
    this.averageRating = averageRating;
    this.countVotes = countVotes;
    this.voters = voters;
  }

  public double getAverageRating() {
    return averageRating;
  }

  public int getCountVotes() {
    return countVotes;
  }

  public List<User> getVoters() {
    return voters;
  }
}
