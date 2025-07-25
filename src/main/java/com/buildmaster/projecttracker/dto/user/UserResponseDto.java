package com.buildmaster.projecttracker.dto.user;

import com.buildmaster.projecttracker.model.user.AuthProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    
    private Long id;
    
    private String username;
    
    private String email;
    
    private String firstName;
    
    private String lastName;
    
    private String fullName;
    
    private boolean enabled;
    
    private AuthProvider provider;
    
    private Set<String> roles;
    
    private LocalDateTime createdAt;
    
    private LocalDateTime lastLogin;
}