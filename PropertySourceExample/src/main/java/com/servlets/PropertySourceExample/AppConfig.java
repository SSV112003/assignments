package com.servlets.PropertySourceExample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.servlets.PropertySourceExample")
@PropertySource("classpath:datafile.properties")
public class AppConfig {
}
