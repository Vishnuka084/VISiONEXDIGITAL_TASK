package au.com.visiondigital.weatherDataBackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Author: Vishnuka Yahan De Silva
 * User:macbookair
 * Date:2025-02-14
 * Time:16:34
 */
@Configuration
public class WebClientConfig {
    @Bean
    public WebClient.Builder webClientBuilder() {
        return  WebClient.builder();
    }
}
