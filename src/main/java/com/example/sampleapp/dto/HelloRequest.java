package com.example.sampleapp.dto;

import com.example.sampleapp.controller.HelloDeserializer;
import com.example.sampleapp.controller.HelloSerializer;
import com.example.sampleapp.entity.Hello;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonDeserialize(using = HelloDeserializer.class)
public class HelloRequest {

    public Hello hello;
    public HelloRequest(){}
    public HelloRequest(Hello hello) {
        this.hello = hello;

    }
}
