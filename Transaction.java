package com.budgetwise.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String type; // INCOME / EXPENSE
    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    // Getters & Setters
}
