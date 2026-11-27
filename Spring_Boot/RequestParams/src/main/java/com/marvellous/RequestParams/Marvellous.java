package com.marvellous.RequestParams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Marvellous
{
    // http://localhost:8080/Add?A=10&B=41
    @GetMapping("Add")
    public int Addition
    (
            @RequestParam("A") int No1,
            @RequestParam("B") int No2
    )

    {
        int Ans = 0;

        Ans = No1 + No2;

        return Ans;
    }
}
