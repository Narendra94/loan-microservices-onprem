package com.example.loan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
	
	List<Loan> findByCustomerId(Long customerId);
}
