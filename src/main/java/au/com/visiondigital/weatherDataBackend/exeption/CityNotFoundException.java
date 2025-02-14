package au.com.visiondigital.weatherDataBackend.exeption;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-14
 * Time:13:17
 */

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException(String city) {
        super("City not found: " + city);
    }
}