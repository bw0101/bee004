package com.bee.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:applicationspecial.yaml", factory = YamlPropertySourceFactory.class)
public class CustomConfig {

}
