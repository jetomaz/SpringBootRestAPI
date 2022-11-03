package com.blogspot.jetomaz.WebAPIRest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blogspot.jetomaz.WebAPIRest.model.Cliente;
import com.blogspot.jetomaz.WebAPIRest.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();		
	}	
}
