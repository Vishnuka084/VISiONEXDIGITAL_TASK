package au.com.visiondigital.weatherDataBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.crypto.Cipher;
import java.util.List;

/**
 * Author: Vishnuka Yahan De Silva
 * User:macbookair
 * Date:2025-02-14
 * Time:16:44
 */

@Data

public class WeatherData {
    private City city;
    private List<Forecast> list;

    @Data
    public static class City {
        private String name;
    }

    @Data
    public static class Forecast {
        private long dt;
        private Main main;

        @Data
        public static class Main {
            private double temp;
        }
    }

}
