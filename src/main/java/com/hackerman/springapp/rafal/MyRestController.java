package com.hackerman.springapp.rafal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/data")
    public String showData() {
        return "my funny data";
    }
}
