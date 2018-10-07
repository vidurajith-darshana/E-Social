package com.esocial.service;

import com.esocial.dto.UserDTO;

public interface UserService {

    public boolean saveUser(UserDTO userDTO);

    public UserDTO getUserByUsername(String username);
}
