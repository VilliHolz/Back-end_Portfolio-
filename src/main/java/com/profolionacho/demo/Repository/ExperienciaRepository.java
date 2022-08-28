package com.profolionacho.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profolionacho.demo.Entity.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
	
	public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

}
