package com.bee;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Component
public class MyComponent {
    @Value("${app.greeting}")
    String message;
}