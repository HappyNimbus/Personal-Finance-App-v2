package com.max.security.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpenseResponse {
    private Long id;
    private double amount;
    private String category;
    private String description;
    private String date;
}
