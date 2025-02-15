package au.com.visiondigital.weatherDataBackend.service.impl;

import au.com.visiondigital.weatherDataBackend.dto.WeatherData;
import au.com.visiondigital.weatherDataBackend.exeption.CityNotFoundException;
import au.com.visiondigital.weatherDataBackend.service.Impl.WeatherServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    void testGetWeatherSummary_Success(){
        String city = "Colombo";
        String jsonResponse = "{ \"city\": {\"name\": \"Colombo\"}," +
                " \"list\": [{\"main\": {\"temp\": 300}, " +
                "\"dt_txt\": \"2025-02-15 12:00:00\"}]}";

        //mock api resp
        when(webClient.get())
                .thenReturn(mock(WebClient.RequestHeadersUriSpec.class));
        WeatherData result = weatherService.getWeatherSummary(city);

        assertNotNull(result);
        assertEquals("Colombo", result.getCity());

    }


    //city not found
    @Test
    void testGetWeatherSummary_CityNotFound() {
        String city = "InvalidCity";
        when(webClient.get()).thenThrow(new CityNotFoundException(city));

        assertThrows(CityNotFoundException.class, () -> weatherService.getWeatherSummary(city));
    }


}
