package org.example.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.example.data.UserEntity;
import org.example.data.UsersRepository;
import org.example.shared.UserDto;

import java.util.UUID;


@Service
public class UsersServiceImpl implements UsersService {
	
	UsersRepository usersRepository;
	
	@Autowired
	public UsersServiceImpl(UsersRepository usersRepository)
	{
		this.usersRepository = usersRepository;

	}
 
	@Override
	public UserDto createUser(UserDto userDetails) {
//		// TODO Auto-generated method stub
//
//		userDetails.setUserId(UUID.randomUUID().toString());
//		userDetails.setEncryptedPassword(
//				bCryptPasswordEncoder.encode(userDetails.getPassword()));
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
//
//		usersRepository.save(userEntity);
//
//		UserDto returnValue = modelMapper.map(userEntity, UserDto.class);
 
		return null;
	}

}
