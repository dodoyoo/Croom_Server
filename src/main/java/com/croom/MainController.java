package com.croom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;


@Controller
public class MainController {
    @GetMapping("/date")
    @ResponseBody
    String test()
    {
        return ZonedDateTime.now().toString();
    }
}
