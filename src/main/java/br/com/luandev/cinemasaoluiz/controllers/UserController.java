package br.com.luandev.cinemasaoluiz.controllers;

import br.com.luandev.cinemasaoluiz.dto.UserDTO;
import br.com.luandev.cinemasaoluiz.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> findAllUsers() {
        return userService.findAll();
    }
}
