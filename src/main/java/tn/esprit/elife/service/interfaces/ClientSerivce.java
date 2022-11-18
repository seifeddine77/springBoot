package tn.esprit.elife.service.interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.elife.persistance.entities.Client;
import tn.esprit.elife.persistance.entities.Profession;

@Service
public interface ClientSerivce {
	List<Client> retrieveAllClients();

	Client addClient(Client c);



	void deleteClient(Long id);

	Client updateClient(Client c);
	Client retrieveClient(Long id);
	List <Client>chercherClientProfession(Profession prof);
	List<Client> chercherParDateNaissanceSup(Date dateN);
	
}
