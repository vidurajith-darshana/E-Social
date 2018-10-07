package com.esocial.controller;

import com.esocial.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/esocial/v1.0/user")
public class UserController {

    @PutMapping
    public boolean saveUser(UserDTO userDTO){
        return true;
    }

}
