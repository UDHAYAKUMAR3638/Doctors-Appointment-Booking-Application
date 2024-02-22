package com.HealthCare.SystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthCare.SystemApplication.model.Permission;

@Repository
public interface PermissionRepo extends JpaRepository<Permission, Long> {
   
}
