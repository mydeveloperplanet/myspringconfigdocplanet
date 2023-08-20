package com.mydeveloperplanet.myspringconfigdocplanet.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@ConfigurationProperties("my.third.properties")
public class MyThirdProperties {

    /**
     * This is the description for stringProperty
     */
    private final String stringProperty;

    /**
     * This is the description for booleanProperty
     */
    private final boolean booleanProperty;

    private final NestedProperty nestedProperty;

    public MyThirdProperties(@DefaultValue("default value for stringProperty") String stringProperty,
                             boolean booleanProperty,
                             @DefaultValue NestedProperty nestedProperty) {
        this.stringProperty = stringProperty;
        this.booleanProperty = booleanProperty;
        this.nestedProperty = nestedProperty;
    }

    @Getter
    public static class NestedProperty {

        /**
         * This is the description for nested stringProperty
         */
        private final String stringProperty;

        /**
         * This is the description for nested booleanProperty
         */
        private final boolean booleanProperty;

        public NestedProperty(@DefaultValue("default value for nested stringProperty") String stringProperty,
                              @DefaultValue("true") boolean booleanProperty) {
            this.stringProperty = stringProperty;
            this.booleanProperty = booleanProperty;
        }
    }
}
