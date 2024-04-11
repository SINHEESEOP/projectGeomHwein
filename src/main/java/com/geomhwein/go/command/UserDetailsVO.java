package com.geomhwein.go.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsVO {

	private String userId; // VARCHAR(100) NOT NULL
	private String userTelno; // VARCHAR(20)
	private String userEmailAddr; // VARCHAR(100) NOT NULL
	private Integer userAge; // INT
	private BigDecimal userRating; // DECIMAL(5,2)
	private String gender; // ENUM('male', 'female', 'other')
	private String address; // TEXT
	private String profilePictureFilename; // TEXT
	private String userRole; // VARCHAR(20)
	private Boolean isActive; // TINYINT(1)
	private LocalDateTime deactivatedAt; // DATETIME
	private LocalDateTime deletionRequestedAt; // DATETIME DEFAULT NULL
	private Integer failedLoginAttempts; // INT DEFAULT 0
	private LocalDateTime lastLoginDatetime; // DATETIME


}