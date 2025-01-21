package br.com.luandev.cinemasaoluiz.services;

import br.com.luandev.cinemasaoluiz.dto.UserDTO;
import br.com.luandev.cinemasaoluiz.entities.User;
import br.com.luandev.cinemasaoluiz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        List<User> userList = userRepository.findAll();
        return userList.stream().map(UserDTO::new).toList();
    }
}
