package com.mydeveloperplanet.myspringconfigdocplanet.controller;

import com.mydeveloperplanet.myspringconfigdocplanet.config.MyFirstProperties;
import com.mydeveloperplanet.myspringconfigdocplanet.config.MyFourthProperties;
import com.mydeveloperplanet.myspringconfigdocplanet.config.MySecondProperties;
import com.mydeveloperplanet.myspringconfigdocplanet.config.MyThirdProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    private final MyFirstProperties myFirstProperties;

    private final MySecondProperties mySecondProperties;

    private final MyThirdProperties myThirdProperties;

    private final MyFourthProperties myFourthProperties;

    public ConfigurationController(MyFirstProperties myFirstProperties, MySecondProperties mySecondProperties, MyThirdProperties myThirdProperties, MyFourthProperties myFourthProperties) {
        this.myFirstProperties = myFirstProperties;
        this.mySecondProperties = mySecondProperties;
        this.myThirdProperties = myThirdProperties;
        this.myFourthProperties = myFourthProperties;
    }

    @RequestMapping("/configuration")
    public String configuration() {
        StringBuilder result = new StringBuilder();
        result.append("MyFirstProperties\n");
        result.append("  Value of stringProperty = ").append(myFirstProperties.getStringProperty()).append("\n");
        result.append("  Value of booleanProperty = ").append(myFirstProperties.isBooleanProperty()).append("\n");

        result.append("MySecondProperties\n");
        result.append("  Value of stringProperty = ").append(mySecondProperties.getStringProperty()).append("\n");
        result.append("  Value of booleanProperty = ").append(mySecondProperties.isBooleanProperty()).append("\n");

        result.append("MyThirdProperties\n");
        result.append("  Value of stringProperty = ").append(myThirdProperties.getStringProperty()).append("\n");
        result.append("  Value of booleanProperty = ").append(myThirdProperties.isBooleanProperty()).append("\n");
        if (myThirdProperties.getNestedProperty() != null) {
            result.append("  Value of nestedProperty.stringProperty = ").append(myThirdProperties.getNestedProperty().getStringProperty()).append("\n");
            result.append("  Value of nestedProperty.booleanProperty = ").append(myThirdProperties.getNestedProperty().isBooleanProperty()).append("\n");
        }

        result.append("MyFourthProperties\n");
        result.append("  Value of stringProperty = ").append(myFourthProperties.stringProperty()).append("\n");
        result.append("  Value of booleanProperty = ").append(myFourthProperties.booleanProperty()).append("\n");

        return result.toString();
    }

}
