package com.max.security.Repo;

import com.max.security.User.FinanceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepo extends JpaRepository<FinanceInfo, Long> {

    FinanceInfo findByUserId(Long userId);
}