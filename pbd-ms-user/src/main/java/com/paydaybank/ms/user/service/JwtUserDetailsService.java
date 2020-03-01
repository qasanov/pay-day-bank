package com.paydaybank.ms.user.service;

import com.paydaybank.ms.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<com.paydaybank.ms.user.domain.User> optionalUser = userRepository.findByEmailAddress(username);

		if(optionalUser.isPresent()){
			com.paydaybank.ms.user.domain.User user = optionalUser.get();
			return new org.springframework.security.core.userdetails.User(user.getEmailAddress(), user.getPassword(), new ArrayList<>());
		}else{
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}