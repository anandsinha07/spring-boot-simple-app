package com.example.sampleapp.controller;

import com.example.sampleapp.dto.HelloRequest;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class HelloSerializer extends StdSerializer<HelloRequest> {

    private HelloRequest value;
    private JsonGenerator jgen;
    private SerializerProvider provider;

    public HelloSerializer() {
        this(null);
    }

    public HelloSerializer(Class<HelloRequest> t) {
        super(t);
    }

    @Override
    public void serialize(
            HelloRequest value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        this.value = value;
        this.jgen = jgen;
        this.provider = provider;

        jgen.writeStartObject();
        jgen.writeStringField("hello", value.hello.name );
        jgen.writeEndObject();
    }
}
