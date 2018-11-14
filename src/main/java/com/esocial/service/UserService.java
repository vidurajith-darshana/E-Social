package com.esocial.service;

import com.esocial.dto.UserDetailDTO;

public interface UserService {

    public boolean saveUser(UserDetailDTO userDetailDTO) throws Exception;

    public boolean updateUser(UserDetailDTO userDetailDTO) throws Exception;

    public UserDetailDTO getUserDetailByEmail(String email) throws  Exception;

}
