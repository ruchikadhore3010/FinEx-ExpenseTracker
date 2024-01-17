package com.example.expensetracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.awt.dnd.DropTarget;
@Table(name = "expense")
@Entity
public class Expense {

    @Id
    private int id;
    private int Date;
    private String Category;
    private double Amount;

    public Expense() {
    }

    public Expense(int id, int Date, String Category, double Amount){
        super();
        this.id = id;
        this.Date = Date;
        this.Category=Category;
        this.Amount = Amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", Date=" + Date +
                ", Category='" + Category + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}

