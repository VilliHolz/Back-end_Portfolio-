package com.profolionacho.demo.Interface;

import java.util.List;

import com.profolionacho.demo.Entity.Persona;

public interface PersonaService {
	
	//Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);

}
