package com.supplements.store1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.supplements.store1.entity.User;

public interface OrderItemRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
