package org.group35EducationCenter.services;

import org.group35educationcenter.dto.NewUserDto;
import org.group35educationcenter.dto.UserDto;

public interface UsersService {

    UserDto register(NewUserDto newUser);
}
