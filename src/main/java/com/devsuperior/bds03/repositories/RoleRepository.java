package com.devsuperior.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bds03.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
