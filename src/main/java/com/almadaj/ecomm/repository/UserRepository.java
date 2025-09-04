package com.almadaj.ecomm.repository;

import com.almadaj.ecomm.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
