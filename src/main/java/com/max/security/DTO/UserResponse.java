package com.max.security.DTO;

public record UserResponse(
        Long id,
        String name,
        String email,
        String role
) {}