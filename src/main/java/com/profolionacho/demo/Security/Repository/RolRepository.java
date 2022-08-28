package com.profolionacho.demo.Security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profolionacho.demo.Security.Entity.Rol;
import com.profolionacho.demo.Security.Enums.RolNombre;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
