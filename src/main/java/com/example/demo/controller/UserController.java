package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User>  findAll(){
        return userService.findAll();
    }
    @PostMapping("/users")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.delete(id);
    }

    @GetMapping("/users/email/{email}")
    public User findByEmail(@PathVariable("email") String email){
        return userService.findByMail(email);
    }
}
