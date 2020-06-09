package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.ILibroService;
import com.example.demo.modelo.Libro;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private ILibroService service;
	
	@GetMapping("/")
	public String listar(Model model) {
		List<Libro>libros=service.listarTodos();
		model.addAttribute("libros", libros);
		return "index";
	}
}
