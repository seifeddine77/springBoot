package tn.esprit.elife.persistance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.persistance.entities.Stock;
@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {

}
