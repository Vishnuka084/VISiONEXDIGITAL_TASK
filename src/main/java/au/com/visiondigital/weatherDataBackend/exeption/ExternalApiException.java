package au.com.visiondigital.weatherDataBackend.exeption;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-14
 * Time:13:19
 */
public class ExternalApiException extends RuntimeException {
    public ExternalApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
