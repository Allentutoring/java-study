package com.tutoring.javastudy.auth;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = "authorities")// 쿼리가 수행될 때 Eager 조회함
    Optional<User> findOneWithAuthoritiesByUsername(String username);

}