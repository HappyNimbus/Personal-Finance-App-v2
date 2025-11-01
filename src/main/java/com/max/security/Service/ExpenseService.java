package com.max.security.Service;

import com.max.security.DTO.ExpenseRequest;
import com.max.security.DTO.ExpenseResponse;
import com.max.security.Repo.ExpenseRepo;
import com.max.security.Repo.UserRepo;
import com.max.security.User.ExpenseInfo;
import com.max.security.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepo expenseRepo;
    private final UserRepo userRepo;


    public ExpenseResponse addExpense(User user, ExpenseRequest request){

        ExpenseInfo expense = ExpenseInfo.builder()
                .user(user)
                .amount(request.getAmount())
                .category(request.getCategory())
                .description(request.getDescription())
                .date(LocalDate.now())
                .build();
        expenseRepo.save(expense);

        return new ExpenseResponse(
                expense.getId(),
                expense.getAmount(),
                expense.getCategory(),
                expense.getDescription(),
                expense.getDate().toString()
        );
    };
}
