package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.model.Customer;


@Repository
public interface Customer_repository extends JpaRepository<Customer,Long>  {
	
}
