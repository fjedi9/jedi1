package com.vepilef.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vepilef.cursomc.domain.Cliente;
import com.vepilef.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) { 
		Optional<Cliente> obj = repo.findById(id); 
		return obj.orElse(null);
		}
}