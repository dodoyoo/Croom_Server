package com.croom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @GetMapping("/test")
    @ResponseBody
    public String test()
    {
        return "테스트중입니다.";
    }
}
