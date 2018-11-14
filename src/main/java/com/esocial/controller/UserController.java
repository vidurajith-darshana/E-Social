package com.esocial.controller;

import com.esocial.dto.UserDetailDTO;
import com.esocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

@CrossOrigin
@RestController
@RequestMapping("/esocial/v1.0/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON)
    public boolean saveUser(@RequestBody UserDetailDTO userDetailDTO) {
        try{
            return userService.saveUser(userDetailDTO);
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
    public boolean updateUser(@RequestBody UserDetailDTO userDetailDTO) {
        try{
            return userService.updateUser(userDetailDTO);
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{email}")
    public String getUserDetailByEmail(@PathVariable String email) {
        try{
            return userService.getUserDetailByEmail(email).toString();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

}
