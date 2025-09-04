package com.almadaj.ecomm.repository;

import com.almadaj.ecomm.domain.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
}
