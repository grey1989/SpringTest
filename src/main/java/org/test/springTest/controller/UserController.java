package org.test.springTest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.springTest.model.User;

@RestController
public class UserController {
    @RequestMapping(path = "/{id}" , method = RequestMethod.GET)
    public User getUser(@PathVariable String id){
        User user = new User();
        user.setUsername(id);
        return user;
    }
}
