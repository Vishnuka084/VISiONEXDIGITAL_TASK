package au.com.visiondigital.weatherDataBackend.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Author: Vishnuka Yahan De Silva
 * User:macbookair
 * Date:2025-02-14
 * Time:16:41
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherSummary {
    private String city;
    private double averageTemperature;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate hottestDay;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate coldestDay;

}
