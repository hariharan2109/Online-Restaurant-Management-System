package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Count;

public interface CountRepo extends JpaRepository<Count, Integer> {

   
}
