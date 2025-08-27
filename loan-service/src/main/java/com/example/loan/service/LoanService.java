package com.example.loan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.loan.model.Loan;
import com.example.loan.repository.LoanRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoanService{
	private final LoanRepository repo;
	
	public List<Loan> getLoanByCustomer(Long customerId) {
		return repo.findByCustomerId(customerId);
	}
	
	public Loan saveLoan(Loan loan) {
		return repo.save(loan);
	}

}
