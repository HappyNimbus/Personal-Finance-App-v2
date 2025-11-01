package com.max.security.Controller;

import com.max.security.DTO.UserResponse;
import com.max.security.Repo.UserRepo;
import com.max.security.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/demo")
@RequiredArgsConstructor
public class DemoController {

    private final UserRepo userRepo;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        List<UserResponse> users = userRepo.findAll()
                .stream()
                .map(u -> new UserResponse(
                        u.getId(),
                        u.getName(),
                        u.getEmail(),
                        u.getRole() != null ? u.getRole().name() : null
                ))
                .toList();
        return ResponseEntity.ok(users);
    }
}
