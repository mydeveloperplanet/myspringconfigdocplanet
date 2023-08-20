package com.mydeveloperplanet.myspringconfigdocplanet.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties("my.first.properties")
public class MyFirstProperties {

    private final String stringProperty;

    private final boolean booleanProperty;

    public MyFirstProperties(String stringProperty, boolean booleanProperty) {
        this.stringProperty = stringProperty;
        this.booleanProperty = booleanProperty;
    }
}
