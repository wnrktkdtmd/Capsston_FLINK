package com.flink.ireview.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserApiRequest {

    private Long id;
    private String account;
    private String password;
    private String email;
    private String phoneNumber;
    private String status;
    private String role;
    private LocalDateTime lastLoginAt;
    private Long loginFailCount;
    private LocalDateTime passwordUpdatedAt;
    private LocalDateTime registeredAt;
    private LocalDateTime unregisteredAt;
    private String loginIp;
    private Integer totalLogin;
    private Integer rangkingPoint;
    private Integer rangkingGrade;
    private int birthYy;
    private int birthMm;
    private int birthDd;
    private Long interest1;
    private Long interest2;
    private Long interest3;
    private Long interest4;
    private Long interest5;

    private String sumnailImage;



}
