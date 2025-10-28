package com.max.security.DTO;

import lombok.Data;

@Data
public class ExpenseRequest {
    private double amount;
    private String category;
    private String description;
}
