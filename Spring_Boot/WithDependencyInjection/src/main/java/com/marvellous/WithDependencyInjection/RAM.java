package com.marvellous.WithDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class RAM
{
    public String GetRAM()
    {
        return "RAM of 8GB";
    }
}
