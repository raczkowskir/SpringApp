package com.hackerman.springapp.rafal;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/myGetMethod")
    public String showData() {
        return "my funny data";
    }

    @PostMapping(path = "/myPostMethod", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addMember(@RequestBody String sth) {
        System.out.println("Here we are:");
        System.out.println(sth);
    }
}
