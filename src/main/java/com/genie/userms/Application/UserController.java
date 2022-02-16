package com.genie.userms.Application;

import com.genie.userms.Domain.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @PostMapping
    public void createUser(@RequestBody User user){

    }


}
