package tn.esprit.elife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.elife.persistance.entities.Client;
import tn.esprit.elife.service.interfaces.ClientSerivce;
@RestController
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	ClientSerivce clientService;
	// http://localhost:8081/SpringMVC/client/retrieve-all-clients
	@GetMapping("/retrieve-all-clients")
	@ResponseBody
	public List<Client> getClients() {
	List<Client> listClients = clientService.retrieveAllClients();
	return listClients;}
	
	@GetMapping("/retrieve-client/{client-id}")
	@ResponseBody
	public Client retrieveClient(@PathVariable("client-id") Long clientId) {
	return clientService.retrieveClient(clientId);
	}
	@PostMapping("/add-client")
	@ResponseBody
	public Client addClient(@RequestBody Client c)
	{
	Client client = clientService.addClient(c);
	return client;
	}
	// http://localhost:8089/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-client/{client-id}")
	@ResponseBody
	public void removeClient(@PathVariable("client-id") Long clientId) {
	clientService.deleteClient(clientId);
	}

	// http://localhost:8089/SpringMVC/client/modify-client
	@PutMapping("/modify-client")
	@ResponseBody
	public Client modifyClient(@RequestBody Client client) {
	return clientService.updateClient(client);
	}
}
     
