package com.prism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/user")
public class UserController {

    @Autowired
    private UserEntityRepository repository;

    @GetMapping("/{name}")
    public String getUser(@PathVariable("names") String name) {
        System.out.println(name);
        UserEntity user = new UserEntity();
        user.setUsername(name);
        user.setPassword("100102hp");
        UserEntity response = repository.save(user);
        return "hello world";
//        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
