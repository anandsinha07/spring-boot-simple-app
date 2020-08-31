package com.example.sampleapp.repository;

import com.example.sampleapp.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends JpaRepository <Hello, Integer> {
}
