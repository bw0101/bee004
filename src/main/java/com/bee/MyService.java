package com.bee;

import com.bee.configuration.AppFirstProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class MyService {

    private MyComponent component;

    private final AppFirstProperties properties;
    public String showMessage(){
        return component.getMessage();
    }

    public String showMessageFromYaml(){
        return properties.getGreeting();
    }
}