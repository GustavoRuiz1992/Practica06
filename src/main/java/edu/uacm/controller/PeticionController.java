package edu.uacm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*Primero llega a peticion, despues a redir y por ultimo se tiene acceso a redirecccion
 * 
 * http://localhost:8080/peticion/redir/
 * */

@Controller//@Con ctrl+espacio
@RequestMapping("/peticion")
public class PeticionController {
	
	@RequestMapping(value="/redir",method = RequestMethod.POST)
	public String redireccionar(){
		return "redirect:/redireccion.html";
		
	}
}
