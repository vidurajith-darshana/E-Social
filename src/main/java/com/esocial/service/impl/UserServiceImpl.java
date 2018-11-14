package com.esocial.service.impl;

import com.esocial.dto.UserDTO;
import com.esocial.dto.UserDetailDTO;
import com.esocial.entity.User;
import com.esocial.entity.UserDetail;
import com.esocial.repository.UserDetailRepository;
import com.esocial.repository.UserRepository;
import com.esocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService {

//    autowired the user and user detail repositories
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailRepository userDetailRepository;

//    save the new user to database
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveUser(UserDetailDTO userDetailDTO) throws Exception{
        UserDTO userDTO=userDetailDTO.getUserDTO();
        User user=new User(userDTO.getUsername(),userDTO.getPassword());

        UserDetail userDetail=new UserDetail(
                user,
                userDetailDTO.getFname(),
                userDetailDTO.getLname(),
                userDetailDTO.getProfileImg(),
                userDetailDTO.getGender(),
                userDetailDTO.getBirthday(),
                userDetailDTO.getJoinDay(),
                userDetailDTO.getEmail(),
                userDetailDTO.getMobNumber(),
                userDetailDTO.getAddress(),
                userDetailDTO.getHometown(),
                userDetailDTO.getCountry(),
                userDetailDTO.getEducation(),
                userDetailDTO.getJobField(),
                userDetailDTO.getPosition(),
                userDetailDTO.getCompany()
        );

        userRepository.save(user);
        userDetailRepository.save(userDetail);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean updateUser(UserDetailDTO userDetailDTO) throws Exception {
        UserDTO userDTO=userDetailDTO.getUserDTO();
        User user=new User(userDTO.getUserId(),userDTO.getUsername(),userDTO.getPassword());

        UserDetail userDetail=new UserDetail(
                userDetailDTO.getUserDetailId(),
                user,
                userDetailDTO.getFname(),
                userDetailDTO.getLname(),
                userDetailDTO.getProfileImg(),
                userDetailDTO.getGender(),
                userDetailDTO.getBirthday(),
                userDetailDTO.getJoinDay(),
                userDetailDTO.getEmail(),
                userDetailDTO.getMobNumber(),
                userDetailDTO.getAddress(),
                userDetailDTO.getHometown(),
                userDetailDTO.getCountry(),
                userDetailDTO.getEducation(),
                userDetailDTO.getJobField(),
                userDetailDTO.getPosition(),
                userDetailDTO.getCompany()
        );
        userRepository.save(user);
        userDetailRepository.save(userDetail);
        return true;
    }

    @Override
    public UserDetailDTO getUserDetailByEmail(String email) throws Exception {
        UserDetail userDetail=userDetailRepository.getByEmail(email);
        if(userDetail!=null){
            return new UserDetailDTO(
                    userDetail.getUserDetailId(),
                    new UserDTO(userDetail.getUser().getUserId(),userDetail.getUser().getUsername(),""),
                    userDetail.getFname(),
                    userDetail.getLname(),
                    userDetail.getProfileImg(),
                    userDetail.getGender(),
                    userDetail.getBirthday(),
                    userDetail.getJoinDay(),
                    userDetail.getEmail(),
                    userDetail.getMobNumber(),
                    userDetail.getAddress(),
                    userDetail.getHometown(),
                    userDetail.getCountry(),
                    userDetail.getEducation(),
                    userDetail.getJobField(),
                    userDetail.getPosition(),
                    userDetail.getCompany()
             );
        }else{
            throw new Exception();
        }
    }
}
