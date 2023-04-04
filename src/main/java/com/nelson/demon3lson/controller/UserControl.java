package com.nelson.demon3lson.controller;

import com.nelson.demon3lson.entity.UserEntity;
import com.nelson.demon3lson.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    UserRepo userRepo;
    @GetMapping
    public ResponseEntity<List<UserEntity>> getAll(){
       if(userRepo.findAll().isEmpty())
           return ResponseEntity.noContent().build();
        return ResponseEntity.ok(userRepo.findAll());
    }
    @PostMapping("/{id}")
    public ResponseEntity<UserEntity>getByid(@PathVariable("id")long id){
        if(userRepo.getReferenceById(id)==null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(userRepo.getReferenceById(id));
    }
    @PostMapping
    public ResponseEntity<UserEntity>save(@RequestBody UserEntity user){
        return ResponseEntity.ok(userRepo.save(user));
    }
}
