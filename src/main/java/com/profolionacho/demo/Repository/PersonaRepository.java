package com.profolionacho.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profolionacho.demo.Entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
