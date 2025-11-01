package com.max.security.Repo;

import com.max.security.User.ExpenseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ExpenseRepo extends JpaRepository<ExpenseInfo, Long> {

    // Custom query to get all expenses for a user
    List<ExpenseInfo> findByUserId(Long userId);
}
