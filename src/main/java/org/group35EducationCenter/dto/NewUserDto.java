package org.group35educationcenter.dto;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class NewUserDto {

    @NotNull
    @Size(min = 3, max = 20, message = "First name length must be between 3 and 20 characters")
    private String firstName;

    @NotNull
    @Size(min = 3, max = 20, message = "Last name length must be between 3 and 20 characters")
    private String lastName;

    @Email
    @NotNull
    private String email;

    @NotNull
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*+=])(?=\\S+$).{8,}$")
    private String password;


}
