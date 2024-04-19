package org.group35EducationCenter.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.group35educationcenter.dto.NewUserDto;
import org.group35educationcenter.dto.UserDto;
import org.group35educationcenter.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UsersService usersService;

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody @Valid NewUserDto newUser) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usersService.register(newUser));
    }


}
