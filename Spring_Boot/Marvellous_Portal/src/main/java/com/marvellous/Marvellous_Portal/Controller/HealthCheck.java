package com.marvellous.Marvellous_Portal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class HealthCheck
{
    @GetMapping("Check")
    public String Check()
    {
        return "Marvellous Portal is Live";
    }

    @GetMapping("/")
    public String HomePage()
    {
        return "Welcome to Marvellous Portal";
    }


}
