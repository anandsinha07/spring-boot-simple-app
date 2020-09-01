package com.example.sampleapp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name"})
public class Hello {

    @Id
    @GeneratedValue
    private Integer id;
//    @JsonProperty("name")
    private String name;
    private String address;

    public Hello(){}

    public Hello(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
