package com.profolionacho.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import com.profolionacho.demo.Repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profolionacho.demo.Entity.Educacion;


@Service
@Transactional
public class EducacionService {
	
	@Autowired
	EducacionRepository educacionRepository;
    
    public List<Educacion> list(){
        return educacionRepository.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return educacionRepository.findById(id);
    }
    
    public Optional<Educacion> getByNmbreE(String nombreE){
        return educacionRepository.findByNombreE(nombreE);
    }
    
    public void save(Educacion educacion){
    	educacionRepository.save(educacion);
    }
    
    public void delete(int id){
    	educacionRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return educacionRepository.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return educacionRepository.existsByNombreE(nombreE);
    }

}
