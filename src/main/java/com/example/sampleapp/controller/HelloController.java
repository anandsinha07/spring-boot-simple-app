package com.example.sampleapp.controller;

import com.example.sampleapp.dto.HelloRequest;
import com.example.sampleapp.entity.Hello;
import com.example.sampleapp.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HelloRepository helloRepository;

    @PostMapping("/writeHello")
    @ResponseStatus(HttpStatus.CREATED)
    public Hello writeHello(@RequestBody HelloRequest helloRequest){

        return helloRepository.save(helloRequest.getHello());
    }

    @GetMapping("/readHello")
    public List<Hello> readHello(){
        return helloRepository.findAll();
    }

}
