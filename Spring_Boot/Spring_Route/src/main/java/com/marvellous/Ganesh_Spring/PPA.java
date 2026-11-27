package com.marvellous.Ganesh_Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PPA
{
    @GetMapping("PPABatch")
    public String DisplayPPA()
    {
        return "PPA is the foundation batch";
    }
}
