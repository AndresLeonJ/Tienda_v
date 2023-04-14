package com.tienda.repository;
import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andres
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
   

    @Query(value = "SELECT * FROM personas WHERE personas.apellido1 LIKE %:filtro%", nativeQuery = true)
    List<Persona> findByApellido1(@Param("filtro") String filtro);

    Persona findByNombre(String nombre);
}
