package com.projetospring.controllers.api;

import java.util.List;

import com.projetospring.dto.ClienteDTO;
import com.projetospring.models.Cliente;
import com.projetospring.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ApiClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/todos")
	public List<Cliente> listarTodos() {
		return clienteService.listarClientes();
	}
	
	//@CrossOrigin
	@GetMapping("/")
	public List<ClienteDTO> listarTodosDTO() {
		return clienteService.listarClientesDTO();
	}
	
	//@CrossOrigin
	@GetMapping("/{cpf}")
	public ClienteDTO buscarCliente(@PathVariable String cpf) {
		return clienteService.buscarCliente(cpf);		
	}
	
	//@CrossOrigin
	@PostMapping("/")
	public Cliente incluirCliente(@RequestBody Cliente cliente) {
		
		return clienteService.incluir(cliente);
		
	}
	
	//@CrossOrigin
	@PutMapping("/{cpf}")
	public Cliente alterarCliente(@RequestBody Cliente cliente,@PathVariable String cpf) {
		return clienteService.alterar(cliente, cpf);		
	}
	
	//@CrossOrigin
	@DeleteMapping("/{cpf}")
	public String deleteCliente(@PathVariable String cpf) {
		return clienteService.remover(cpf);
		
	}
}






