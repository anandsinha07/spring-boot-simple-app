package com.example.sampleapp.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@JsonRootName("Hello")
public class Hello {

    @Id
    @GeneratedValue
    private Integer id;
    public String name;
    public String address;

    public Hello(){}

    public Hello(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
