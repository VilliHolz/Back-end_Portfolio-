package com.profolionacho.demo.Security.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profolionacho.demo.Security.Entity.Rol;
import com.profolionacho.demo.Security.Enums.RolNombre;
import com.profolionacho.demo.Security.Repository.RolRepository;

@Service
@Transactional
public class RolService {
	
	@Autowired
    RolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }

}
