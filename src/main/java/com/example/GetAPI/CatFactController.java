package com.example.GetAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cat")
public class CatFactController {
    @Autowired
    CatFact catFact;
    String url ="https://catfact.ninja/fact?max_length=140";
    @GetMapping("getFacts")
    public CatFact getFacts( ){
        return catFact.getFacts(url);
    }


}
