package au.com.visiondigital.weatherDataBackend.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Vishnuka Yahan De Silva
 * User:macbookair
 * Date:2025-02-14
 * Time:16:32
 */
@Configuration
@EnableCaching
public class CacheConfig {
    @Bean
    public CacheManager cacheManager() {
        return  new CaffeineCacheManager("weatherSummaries");
    }

}
