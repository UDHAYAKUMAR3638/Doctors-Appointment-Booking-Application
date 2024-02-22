package com.HealthCare.SystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthCare.SystemApplication.model.RolePermission;

@Repository
public interface RolePermissionRepo extends JpaRepository<RolePermission, Long> {
    
}
