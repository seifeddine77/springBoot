package tn.esprit.elife.service.classes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.elife.persistance.entities.Client;
import tn.esprit.elife.persistance.entities.Profession;
import tn.esprit.elife.persistance.repository.ClientRepository;
import tn.esprit.elife.service.interfaces.ClientSerivce;

@Service
public class ClientServiceImpl implements ClientSerivce {
	@Autowired
	ClientRepository clientRep;
	
	@Override
	public List<Client> retrieveAllClients()
	{
		return (List<Client>) clientRep.findAll();
		
		
	}
	
	@Override
	public Client addClient(Client c)
	{
		clientRep.save(c);
		return c;
		
	}
	
	@Override
	public void deleteClient(Long id)
	{   Client c = clientRep.findById(id).get();
		clientRep.delete(c);;
		
		
		
	}
@Override
public Client updateClient(Client c) {
	
	
	clientRep.save(c);
	
	
	return (c);
	



}


@Override
public Client retrieveClient(Long id) {
	Client c = clientRep.findById(id).get();
	return (c);
}

@Override
public List<Client> chercherClientProfession(Profession prof) {
	 
	return clientRep.findClientByProfession(prof);
}

@Override
public List<Client> chercherParDateNaissanceSup(Date dateN) {
	
	return clientRep.findByDateNaissanceGreaterThan(dateN);
}



}
