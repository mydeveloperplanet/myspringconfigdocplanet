package com.mydeveloperplanet.myspringconfigdocplanet.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param stringProperty This is the description for stringProperty
 * @param booleanProperty This is the description for booleanProperty
 */
@ConfigurationProperties("my.fourth.properties")
public record MyFourthProperties (@DefaultValue("default value for stringProperty") String stringProperty,
                                  @DefaultValue("true") boolean booleanProperty) {
}


