package com.marvellous.Ganesh_Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    public HardDisk hobj;
    public RAM robj;

    public Laptop()
    {
        this.hobj = new HardDisk();
        this.robj = new RAM();
    }
    @GetMapping("Laptop")
    public String GetLaptop()
    {
        return "Laptop contains" + hobj.GetHardDisk()+ " and "+ robj.GetRAM();
    }
}
