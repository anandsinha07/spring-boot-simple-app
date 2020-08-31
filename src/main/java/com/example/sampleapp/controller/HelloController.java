package com.example.sampleapp.controller;

import com.example.sampleapp.dto.HelloRequest;
import com.example.sampleapp.entity.Hello;
import com.example.sampleapp.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloRepository helloRepository;

    @PostMapping("/writeHello")
    public Hello writeHello(@RequestBody HelloRequest helloRequest){
        
        return helloRepository.save(helloRequest.getHello());
    }

}
