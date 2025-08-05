package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ConfigReader {

    @Value("${app.name:DefaultApp}")
    private String appName;

    @Value("${app.version:0.0.1}")
    private String version;

    @Value("${app.example.integer-value}")
    private int intValue;

    @Value("${app.example.decimal-value}")
    private double decimalValue;

    @Value("${app.example.boolean-value}")
    private boolean booleanValue;

    @PostConstruct
    public void displayConfig() {
        System.out.println("Application Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Decimal Value: " + decimalValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}
