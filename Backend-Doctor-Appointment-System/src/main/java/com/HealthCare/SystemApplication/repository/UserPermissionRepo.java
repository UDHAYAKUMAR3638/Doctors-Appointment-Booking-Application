package com.HealthCare.SystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthCare.SystemApplication.model.UserPermission;

@Repository
public interface UserPermissionRepo extends JpaRepository<UserPermission, Long> {  
}
