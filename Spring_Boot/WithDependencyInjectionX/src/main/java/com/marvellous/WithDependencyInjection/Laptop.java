package com.marvellous.WithDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @Autowired
    public HardDisk hobj;

    @Autowired
    public RAM robj;

    @GetMapping("PurchaseLaptop")
    public String GetLaptop()
    {
        String str1 = hobj.GetHardDisk();
        String str2 = robj.GetRAM();

        return "Laptop Contains " + str1 + " and " + str2;
    }

}
