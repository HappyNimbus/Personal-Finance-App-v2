package com.max.security.Controller;

import com.max.security.DTO.ExpenseRequest;
import com.max.security.DTO.ExpenseResponse;
import com.max.security.DTO.RegisterRequest;
import com.max.security.Service.ExpenseService;
import com.max.security.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<ExpenseResponse> addExpense(
            @RequestBody ExpenseRequest request,
            Authentication authentication
    ){

        var user = (User) authentication.getPrincipal();
        return ResponseEntity.ok(expenseService.addExpense(user, request));

    }

}
