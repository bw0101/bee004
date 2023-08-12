package com.bee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class MyService {

    private MyComponent component;

    public String showMessage(){
        return component.getMessage();
    }
}