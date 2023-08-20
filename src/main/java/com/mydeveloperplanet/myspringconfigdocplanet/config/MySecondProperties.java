package com.mydeveloperplanet.myspringconfigdocplanet.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@ConfigurationProperties("my.second.properties")
public class MySecondProperties {

    /**
     * This is the description for stringProperty
     */
    private final String stringProperty;

    /**
     * This is the description for booleanProperty
     */
    private final boolean booleanProperty;

    public MySecondProperties(@DefaultValue("default value for stringProperty") String stringProperty,
                              boolean booleanProperty) {
        this.stringProperty = stringProperty;
        this.booleanProperty = booleanProperty;
    }
}
