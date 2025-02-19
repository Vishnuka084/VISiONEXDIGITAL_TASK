package au.com.visiondigital.weatherDataBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-14
 * Time:13:12
 */
@Data
@AllArgsConstructor
@ToString
public class WeatherData {

    private String city;
    private double averageTemperature;
    private String hottestDay;
    private String coldestDay;
}

