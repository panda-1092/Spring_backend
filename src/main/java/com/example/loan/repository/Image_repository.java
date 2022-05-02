package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.model.Document;

@Repository
public interface Image_repository extends JpaRepository<Document,Long> {

}
