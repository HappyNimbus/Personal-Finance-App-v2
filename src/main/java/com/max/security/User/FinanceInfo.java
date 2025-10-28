package com.max.security.User;

import com.max.security.Enum.Schedule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "finances")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FinanceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name ="income", nullable = false)
    private double income;

    @Enumerated(EnumType.STRING)
    private Schedule schedule;


}
