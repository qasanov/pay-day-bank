package com.paydaybank.ms.user.repository;

import com.paydaybank.ms.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User,String> {

    Optional<User> findByEmailAddress(String email);

}
