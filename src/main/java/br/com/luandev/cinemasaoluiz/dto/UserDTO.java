package br.com.luandev.cinemasaoluiz.dto;

import br.com.luandev.cinemasaoluiz.entities.User;
import org.springframework.beans.BeanUtils;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String birthDate;

    public UserDTO() {
    }

    public UserDTO(User entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
