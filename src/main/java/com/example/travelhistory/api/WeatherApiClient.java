package com.example.travelhistory.api;

import com.example.travelhistory.entity.Weather;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherApiClient {

    public String getTemperature(String cityName) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q="
                        + cityName + "&units=metric&appid=58383410ff9c2153348eddd5fc4feec7"
                , Weather.class).getMain().getTemp();
    }
}

