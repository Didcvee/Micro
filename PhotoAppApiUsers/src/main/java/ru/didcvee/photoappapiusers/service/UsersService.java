package ru.didcvee.photoappapiusers.service;


import ru.didcvee.photoappapiusers.shared.UserDto;

public interface UsersService {
	UserDto createUser(UserDto userDetails);
}
