package com.budgetwise.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class SavingsGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String goalName;
    private double targetAmount;
    private double currentAmount;
    private LocalDate deadline;

    // Getters & Setters
}
