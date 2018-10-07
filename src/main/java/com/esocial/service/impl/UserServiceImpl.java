package com.esocial.service.impl;

import com.esocial.dto.UserDTO;
import com.esocial.entity.User;
import com.esocial.repository.UserRepository;
import com.esocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveUser(UserDTO userDTO) {
        return false;
    }

    @Override
    public UserDTO getUserByUsername(String username) {
        try{
            User user=userRepository.getByUserName(username);
            return new UserDTO(user.getUserId(),user.getUsername(),user.getPassword());
        }catch (RuntimeException e){
            return null;
        }
    }
}
