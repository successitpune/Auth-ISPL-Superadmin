package com.adminverification.adminverification.Dao;

import com.adminverification.adminverification.Entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminUserRepository extends JpaRepository<AdminUser,Long> {
    Optional<AdminUser>findByEmail(String email);
}