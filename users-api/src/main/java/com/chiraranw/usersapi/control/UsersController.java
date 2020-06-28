package com.chiraranw.usersapi.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users/")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UsersController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
