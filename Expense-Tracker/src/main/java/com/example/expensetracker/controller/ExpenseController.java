package com.example.expensetracker.controller;

import com.example.expensetracker.entity.Expense;
import com.example.expensetracker.repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseRepo expenseRepo;

    @PostMapping("/addExpense")
    public Expense addExpense(@RequestBody Expense expense){
        expenseRepo.save(expense);
        return expense;
    }
    @GetMapping("/getAll")
    public List<Expense> getAllExpenses(){
        List<Expense> expenseList = expenseRepo.findAll();
        return expenseList;
    }
    @DeleteMapping("/deleteExpense/{id}")
    public String deleteExpense(@PathVariable int id){
        Expense expense = expenseRepo.findById(id).get();
        if(expense != null){
            expenseRepo.delete(expense);
        }
        return "Expense deleted successfully";
    }
    @PutMapping("/updateExpense")
    public Expense updateExpense(@RequestBody Expense expense){
        expenseRepo.save(expense);
        return expense;
    }


}
