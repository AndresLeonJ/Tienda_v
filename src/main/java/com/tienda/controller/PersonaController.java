
package com.tienda.controller;

import ch.qos.logback.core.model.Model;
import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import com.tienda.service.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author Andres
 */
@Controller
public class PersonaController {
    
    @Autowired 
    private IPaisService personaService;
    
    @Autowired 
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index (Model model){
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Persona");
        model.addAttribute("personas", listaPersona);
        return"personas";
    } 
    @GetMapping("/personaN")
    public String crearPersona(Model model){
      List<Pais> listaPaises = paisService.listCountry();
      model.addAtributte("persona", new Persona());
      model.addAtributte("paises", listaPaises());
      return("crear");
    
}
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePersona(persona);
        return"redirect:/persona";
    }

            
            
            
            
            
            
            
            
            
            
            
            
            
     
    
}
