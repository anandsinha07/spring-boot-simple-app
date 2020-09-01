package com.example.sampleapp.dto;

import com.example.sampleapp.controller.HelloDeserializer;
import com.example.sampleapp.entity.Hello;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonDeserialize(using = HelloDeserializer.class)
public class HelloRequest {

    private Hello hello;
    public HelloRequest(Hello hello) {
        this.hello = hello;

    }
}
