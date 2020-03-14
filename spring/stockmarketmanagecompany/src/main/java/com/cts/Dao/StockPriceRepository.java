package com.cts.Dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice,String> {

}
