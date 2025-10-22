package com.rahul.loans;

import com.rahul.loans.dto.LoansContactInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(LoansContactInfo.class)
public class LoansApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
