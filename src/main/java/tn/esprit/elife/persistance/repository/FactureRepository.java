package tn.esprit.elife.persistance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.persistance.entities.Facture;
@Repository
public interface FactureRepository extends CrudRepository<Facture, Long>{

}
