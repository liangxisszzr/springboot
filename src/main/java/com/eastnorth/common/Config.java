package com.eastnorth.common;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zuojianhou
 * @Date: 2020/3/20
 * @Description:
 */
@Configuration
public class Config {
    @Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags(){
        return registry -> registry.config().commonTags("service","test");
    }
}
