package com.badgan.controller;

import com.badgan.model.UserDTO;
import com.badgan.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.AllArgsConstructor;

@Controller("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @Post("/register")
    public HttpResponse<UserDTO> registerUser(@Body UserDTO user) {

        return HttpResponse.accepted();
    }

}
