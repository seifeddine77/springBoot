package tn.esprit.elife.persistance.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.persistance.entities.Client;
import tn.esprit.elife.persistance.entities.Profession;

@Repository
public interface ClientRepository  extends CrudRepository<Client,Long> {
	
	List <Client>  findClientByProfession(Profession prof);
	List <Client> findByDateNaissanceGreaterThan(Date dateN);
	


}
