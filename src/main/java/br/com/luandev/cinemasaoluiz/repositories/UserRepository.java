package br.com.luandev.cinemasaoluiz.repositories;

import br.com.luandev.cinemasaoluiz.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
