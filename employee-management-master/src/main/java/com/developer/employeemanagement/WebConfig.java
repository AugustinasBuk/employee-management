package com.developer.employeemanagement;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This class configures global cors
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final String developmentOrigin = "http://127.0.0.1:5500";

    /**
     * //todo
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins(developmentOrigin)
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
