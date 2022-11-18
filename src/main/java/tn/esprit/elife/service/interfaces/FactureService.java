package tn.esprit.elife.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.elife.persistance.entities.Facture;
@Service
public interface FactureService {
	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);
}
