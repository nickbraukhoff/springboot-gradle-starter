package com.moxe.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @since 3/26/17.
 */
@Configuration
@ComponentScan(basePackages = {"com.moxe.core"})
@PropertySource("classpath:/application.properties")
public class ApplicationConfig {
}
