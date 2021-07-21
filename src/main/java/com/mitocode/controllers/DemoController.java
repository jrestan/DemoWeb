package com.mitocode.controllers;


import com.mitocode.models.Persona;
import com.mitocode.repositories.IPersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    
    @Autowired
    private IPersonaRepo repo;

    @GetMapping("/hola")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        Persona p = new Persona();
        p.setId(2);
        p.setNombre("Gonzalo Restan");
        repo.save(p);

		model.addAttribute("name", name);
		return "greeting";
	}

    /*
    @GetMapping("/listar")
	public ArrayList<Persona> obtPersonas() {
        //model.addAttribute("personas", repo.findAll());
		//return "lista";
        return (ArrayList<Persona>)repo.findAll();
	}*/

    @GetMapping("/listar")
	public String greeting(Model model) {
        model.addAttribute("personas", repo.findAll());
		return "lista";
	}


}
