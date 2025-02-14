package au.com.visiondigital.weatherDataBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableAsync
public class WeatherDataBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataBackendApplication.class, args);
		System.out.println("hello Hello");
	}

}
