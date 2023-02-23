package com.hackerman.springapp.rafal;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public String addMember(@RequestBody String requBody) {
        System.out.println("This is my name:");
        System.out.println(requBody);
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonNode = mapper.readTree(requBody);
        }
        catch (Exception e) {
            System.out.println("We have un exception");
        }

        return "My name is:";
    }
}
