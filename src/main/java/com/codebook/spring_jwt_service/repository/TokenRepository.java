package com.codebook.spring_jwt_service.repository;

import com.codebook.spring_jwt_service.model.Token;
import com.codebook.spring_jwt_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    List<Token> findByUsername(String username);
    List<Token> findByEmail(String email);
    Optional<Token> findByToken(String token);
    Object findAllByUser(User user);
}
