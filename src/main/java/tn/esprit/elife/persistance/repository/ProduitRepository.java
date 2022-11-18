package tn.esprit.elife.persistance.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.esprit.elife.persistance.entities.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit,Long> {
	
	


}
