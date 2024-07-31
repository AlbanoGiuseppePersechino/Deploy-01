package co.develhope.deploy01.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @Value("${myCustomDevName.devName}")
    private String devName;

    @GetMapping("/devname")
    public String devName(){
        return  devName;
    }
}
