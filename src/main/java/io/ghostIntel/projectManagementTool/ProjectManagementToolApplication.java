package io.ghostIntel.projectManagementTool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.Principal;

@SpringBootApplication
public class ProjectManagementToolApplication {
	
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementToolApplication.class, args);
	}

}
