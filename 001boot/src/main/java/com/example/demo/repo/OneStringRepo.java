package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StringOne;

public interface OneStringRepo extends JpaRepository<StringOne, Long> {

}
