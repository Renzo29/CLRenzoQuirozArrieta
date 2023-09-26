package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.InterfaceService.IClienteService;
import org.cibertec.edu.pe.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
	
	private IClienteService servicio;
	
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Cliente> lista = servicio.Listado();
		m.addAttribute("clientes",lista);
		return "listar";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("cliente", new Cliente());
		return "form";				
	}
	
	@GetMapping("/grabar")
	public String grabar(@Validated Cliente c, Model m) {
		servicio.Grabar(c);
		return "redirect:/listar";
	}
}
