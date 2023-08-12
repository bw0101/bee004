package com.bee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MyController {

    private MyService myService;
    @GetMapping("/hi")
    public String sayHi() {
        return "Hi, Bee!";
    }

    @GetMapping("/hiYaml")
    public String messageFromYaml() {
        return myService.showMessage();
    }
}