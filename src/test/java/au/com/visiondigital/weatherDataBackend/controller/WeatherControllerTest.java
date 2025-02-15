package au.com.visiondigital.weatherDataBackend.controller;

import au.com.visiondigital.weatherDataBackend.dto.WeatherData;
import au.com.visiondigital.weatherDataBackend.service.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-15
 * Time:11:54
 */

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    private MockMvc mockMvc;

    @Mock
    private WeatherService weatherService;
    @InjectMocks
    private WeatherController weatherController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(weatherController).build();
    }

    //success summary
    @Test
    void testGetWeatherSummary_Success() throws Exception {
        String city = "Colombo";
        WeatherData mockWeatherData = new WeatherData(city, 25.5, "2025-02-14", "2025-02-10");

        when(weatherService.getWeatherSummary(city)).thenReturn(mockWeatherData);

        mockMvc.perform(get("/weather?city=Colombo")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.city").value("Colombo"))
                .andExpect(jsonPath("$.averageTemperature").value(25.5));
    }

    //city not found
    @Test
    void testGetWeatherSummary_CityNotFound() throws Exception {
        String city = "TestUnawatuna";

        when(weatherService.getWeatherSummary(city)).thenThrow(new RuntimeException("City not found"));

        mockMvc.perform(get("/weather?city=TestUnawatuna")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isInternalServerError());
    }
}
