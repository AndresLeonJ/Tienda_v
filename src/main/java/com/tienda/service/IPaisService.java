package com.tienda.service;
import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author Andres
 */
public interface IPaisService {
    public List<Pais> listCountry();

    public List<Persona> getAllPersona();
}
