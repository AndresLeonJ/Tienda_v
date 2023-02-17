
package com.tienda.controller;


import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import com.tienda.service.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.Model;
import org.springframework.ui.Model;


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
      model.addAttribute("persona", new Persona());
      model.addAttribute("paises", listaPaises();
      return("crear");
    
}
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePersona(persona);
        return"redirect:/persona";
    }

            
            
            
            
            
            
            
            
            
            
            
            
            
     
    
}
