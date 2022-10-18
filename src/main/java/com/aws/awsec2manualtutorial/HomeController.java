package com.aws.awsec2manualtutorial;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/aws-ec2")
public class HomeController {


    @GetMapping
    public String getHomePage() {

        return "up and running";
    }
}
