package com.example.loan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.Loan;
import com.example.loan.service.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/{customerId}")
    public List<Loan> getLoans(@PathVariable Long customerId) {
        return loanService.getLoanByCustomer(customerId);
    }

    @PostMapping
    public Loan addLoan(@RequestBody Loan loan) {
        return loanService.saveLoan(loan);
    }
}
