package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.elife.persistance.entities.Produit;

import tn.esprit.elife.persistance.repository.ProduitRepository;
import tn.esprit.elife.service.interfaces.ProduitService;

@Service
public class ProduitServicelmpl implements ProduitService {

	@Autowired
	ProduitRepository produitRep;
	@Override
	public List<Produit> retrieveAllProduits() {
		return (List<Produit>) produitRep.findAll();
	
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		produitRep.save(p);
		return p;
	}

	@Override
	public Produit retrieveProduit(Long id) {
		Produit p = produitRep.findById(id).get();
		return (p);
	}

}
