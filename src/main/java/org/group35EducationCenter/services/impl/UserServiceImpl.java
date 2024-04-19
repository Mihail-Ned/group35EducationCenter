package org.group35EducationCenter.services.impl;

import lombok.RequiredArgsConstructor;
import org.group35educationcenter.dto.NewUserDto;
import org.group35educationcenter.dto.UserDto;
import org.group35educationcenter.repositories.UserRepository;
import org.group35educationcenter.services.UsersService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsersService {

    private final UserRepository userRepository;

    @Override
    public UserDto register(NewUserDto newUser) {
        return null;
    }
}
