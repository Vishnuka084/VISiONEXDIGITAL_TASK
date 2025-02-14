package au.com.visiondigital.weatherDataBackend.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Vishnuka Yahan De Silva
 * User:vishnuka
 * Date:2025-02-14
 * Time:13:01
 */
@Configuration
public class CacheConfig {
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("weatherSummary");
    }
}
