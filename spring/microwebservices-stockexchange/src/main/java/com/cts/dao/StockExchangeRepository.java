package com.cts.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange,String>{
Iterable<StockExchange> findAll();
List<StockExchange> findByStockExchange(String stockExchange);
}
