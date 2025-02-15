package au.com.visiondigital.weatherDataBackend.service.impl;

import au.com.visiondigital.weatherDataBackend.service.Impl.WeatherServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-15
 * Time:11:45
 */

@ExtendWith(MockitoExtension.class)
class WeatherServiceImplTest {
    @Mock
    private WebClient webClient;

    @InjectMocks
    private WeatherServiceImpl weatherService;

    @BeforeEach
    void setUp(){
        weatherService = new WeatherServiceImpl(webClient);

    }
    
}
