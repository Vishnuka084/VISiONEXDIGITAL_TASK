package au.com.visiondigital.weatherDataBackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-14
 * Time:13:04
 */
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl("https://api.openweathermap.org").build();
    }
}
