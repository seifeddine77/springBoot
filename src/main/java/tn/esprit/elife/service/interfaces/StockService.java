package tn.esprit.elife.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.elife.persistance.entities.Stock;
@Service
public interface StockService {
	List<Stock> retrieveAllStocks();
	Stock addStock(Stock s);

	Stock updateStock(Stock u);
	Stock retrieveStock(Long id);
}
