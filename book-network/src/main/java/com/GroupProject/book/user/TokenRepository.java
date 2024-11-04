package com.GroupProject.book.user;

import com.GroupProject.book.user.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository {//extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);
}