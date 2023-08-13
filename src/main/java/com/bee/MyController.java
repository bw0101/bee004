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

    @GetMapping("/hiYamlValue")
    public String messageFromYamlTroughValue() {
        return myService.showMessage();
    }

    @GetMapping("/hiYamlConf")
    public String messageFromYamlTroughConfiguration() {
        return myService.showMessageFromYaml();
    }
}