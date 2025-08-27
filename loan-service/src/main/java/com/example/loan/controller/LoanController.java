package com.example.loan.controller;

import com.example.loan.model.Loan;
import com.example.loan.repository.LoanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanRepository repository;

    public LoanController(LoanRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Loan> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Loan create(@RequestBody Loan loan) {
        return repository.save(loan);
    }
}
