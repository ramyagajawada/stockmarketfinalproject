package com.cts.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.StockExchangeRepository;
import com.cts.pojos.StockExchange;
@RestController
@RequestMapping("/StockExchange")
@CrossOrigin(origins="*", allowedHeaders="*")
public class StockExchangeController {
 @Autowired
 private StockExchangeRepository stockexchangeRepository;
 @RequestMapping("/getAllStockExchange")
 public Iterable<StockExchange> getAllStockExchange() {
 return stockexchangeRepository.findAll();
 }
 @PostMapping("/saveStockExchange")
 public StockExchange saveStockExchange(@RequestBody StockExchange stockexchange) {
 System.out.println(stockexchange);
 stockexchangeRepository.save(stockexchange);
 return stockexchange;
 }
 @PutMapping("/updateStockExchange/{id}")
 public StockExchange updateStockExchange(@RequestBody StockExchange stockexchange,
  @PathVariable("id") String id) {
 stockexchange.setId(id);
 System.out.println(stockexchange);
 stockexchangeRepository.save(stockexchange);
 return stockexchange;
 }
 @DeleteMapping("/deleteStockExchange/{id}")
 public Boolean deleteStockExchange(@PathVariable("id") String id) {
 System.out.println(id);
 Optional<StockExchange> stockexchange = stockexchangeRepository.findById(id);
 stockexchangeRepository.delete(stockexchange.get());
 return true;
 }
 @GetMapping("/findOneInAll2/{id}")
 public StockExchange findOneInAll2(@PathVariable("id") String id)
 {
 Optional<StockExchange> stockexchange = stockexchangeRepository.findById(id);
 return stockexchange.get();
 }
 @GetMapping("/findByStockExchange/{stockExchange}")
 public List<StockExchange> findByStockExchange(@PathVariable("stockExchange") String stockExchange)
 {
	 List<StockExchange> stockexchange= stockexchangeRepository.findByStockExchange(stockExchange);
	 return stockexchange;
 }

}

