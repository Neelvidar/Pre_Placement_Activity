package com.marvellous.WithDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class HardDisk
{
    public String GetHardDisk()
    {
        return "HardDisk of 512 GB";
    }
}
