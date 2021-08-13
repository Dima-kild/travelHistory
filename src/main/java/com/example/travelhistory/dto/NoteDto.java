package com.example.travelhistory.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteDto {


    private Long id;
    private String countryName;
    private String currentWeather;
    private Long yearOfJourney;
    private String info;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
    }

    public Long getYearOfJourney() {
        return yearOfJourney;
    }

    public void setYearOfJourney(Long yearOfJourney) {
        this.yearOfJourney = yearOfJourney;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
