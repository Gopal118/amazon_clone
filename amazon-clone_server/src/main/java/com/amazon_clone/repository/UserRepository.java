package com.amazon_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amazon_clone.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
