package tn.esprit.elife.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.elife.persistance.entities.Produit;
@Service
public interface ProduitService {
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon ,Long idStock);

	Produit retrieveProduit(Long id);
}
