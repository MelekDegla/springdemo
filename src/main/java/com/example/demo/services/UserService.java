package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User findByMail(String email){
        return userRepository.findUserByEmail(email);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
