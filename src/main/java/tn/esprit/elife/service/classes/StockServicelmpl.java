package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.elife.persistance.entities.Stock;
import tn.esprit.elife.persistance.repository.StockRepository;
import tn.esprit.elife.service.interfaces.StockService;

public class StockServicelmpl  implements StockService{
	@Autowired
	StockRepository stockRep;
	@Override
	public List<Stock> retrieveAllStocks() {
		
		return (List<Stock>)stockRep.findAll();
	}

	@Override
	public Stock addStock(Stock s) {
		stockRep.save(s);
		return s;
	}

	@Override
	public Stock updateStock(Stock u) {
		stockRep.save(u);
		return u;
	}

	@Override
	public Stock retrieveStock(Long id) {
		Stock s = stockRep.findById(id).get();
		
		return s;
	}

}
