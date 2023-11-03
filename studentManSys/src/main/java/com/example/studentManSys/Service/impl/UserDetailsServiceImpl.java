package com.example.studentManSys.Service.impl;

import com.example.studentManSys.CustomUserDetails;
import com.example.studentManSys.Model.UserDtls;
import com.example.studentManSys.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

 import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDtls user = userRepository.findByEmail(username);

        if(user != null) {
            return new CustomUserDetails(user);
        }

        throw new UsernameNotFoundException("User not available");
    }
}
