package ru.didcvee.photoappapiusers.service;

import ru.didcvee.photoappapiusers.model.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
