package au.com.visiondigital.weatherDataBackend.service;

import au.com.visiondigital.weatherDataBackend.dto.WeatherData;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-14
 * Time:14:22
 */
public interface WeatherService {
    WeatherData getWeatherSummary(String city);
}
