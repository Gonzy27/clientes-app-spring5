package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import org.springframework.stereotype.Service;

@Service
public interface IClienteService {
	
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente findById(Long id);
	public List<Region> findAllRegiones();
}
