package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer> {
   
}
