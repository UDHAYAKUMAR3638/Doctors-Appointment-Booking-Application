package com.HealthCare.SystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthCare.SystemApplication.model.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);
}
