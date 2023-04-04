package com.nelson.demon3lson.service;

import com.nelson.demon3lson.entity.UserEntity;
import com.nelson.demon3lson.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
     UserRepo userRepo;
     UserEntity findbyId(long id){
        return userRepo.findById(id).orElse(null);
    }
     UserEntity add(UserEntity userEntity){
         return userRepo.save(userEntity);
    }
     List<UserEntity> findAll(){
        return userRepo.findAll().stream().collect(Collectors.toList());
    }
}
