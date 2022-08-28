package com.profolionacho.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profolionacho.demo.Entity.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
	
	public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

}
