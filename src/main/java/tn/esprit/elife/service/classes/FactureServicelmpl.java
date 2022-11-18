package tn.esprit.elife.service.classes;

import java.util.List;

import tn.esprit.elife.persistance.entities.Facture;
import tn.esprit.elife.persistance.repository.FactureRepository;
import tn.esprit.elife.service.interfaces.FactureService;

public class FactureServicelmpl implements FactureService {
FactureRepository factureRep;
	@Override
	public List<Facture> retrieveAllFactures() {
		
		return (List<Facture>) factureRep.findAll();
	}

	@Override
	public void cancelFacture(Long id) {
		Facture f = factureRep.findById(id).get();
		factureRep.save(f);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
	Facture f = factureRep.findById(id).get();
		return f;
	}

}
