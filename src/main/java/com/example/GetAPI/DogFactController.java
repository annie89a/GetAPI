package com.example.GetAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dog")
public class DogFactController {
    @Autowired
    DogFact dogFact;
    String url ="https://dogapi.dog/api/v2/facts?limit=150";
    @GetMapping("getFacts")
    public DogFact getFacts( ){
        return dogFact.getFacts(url);
    }
}
