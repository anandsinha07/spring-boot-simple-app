package com.example.sampleapp.dto;

import com.example.sampleapp.entity.Hello;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloRequest {
    private Hello hello;
}
