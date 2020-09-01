package com.example.sampleapp.controller;

import com.example.sampleapp.dto.HelloRequest;
import com.example.sampleapp.entity.Hello;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class HelloDeserializer extends StdDeserializer<HelloRequest> {

    public HelloDeserializer() {
        this(null);
    }

    public HelloDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public HelloRequest deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        String name = node.get("name").asText();
        return new HelloRequest(new Hello(name));

    }
}
