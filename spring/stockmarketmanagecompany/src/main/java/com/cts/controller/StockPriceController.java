package com.cts.controller;

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

import com.cts.Dao.StockPriceRepository;
import com.cts.pojos.StockPrice;
@RestController
@RequestMapping("/StockPrice")
@CrossOrigin(origins="*", allowedHeaders="*")
public class StockPriceController {
@Autowired
	private StockPriceRepository stockpriceRepository;
	@RequestMapping("/getAllStockPrice")
	public Iterable<StockPrice> getAllStockPrice() {
		return stockpriceRepository.findAll();
	}
	@PostMapping("/saveStockPrice")
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice) {
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;
	}
	@PutMapping("/updateStockPrice/{companyCode}")
	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice,@PathVariable("companyCode") String companyCode) {
		stockprice.setCompanyCode(companyCode);
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;
	}
	@DeleteMapping("/deleteStockPrice/{companyCode}")
	public Boolean deleteStockPrice(@PathVariable("companyCode") String companyCode) {
		System.out.println(companyCode);
		Optional<StockPrice> stockprice = stockpriceRepository.findById(companyCode);
		stockpriceRepository.delete(stockprice.get());
		return true;
	}
	@GetMapping("/findOneInAll1/{companyCode}")
	public StockPrice findOneInAll1(@PathVariable("companyCode") String companyCode)
	{
		Optional<StockPrice> stockprice = stockpriceRepository.findById(companyCode);
		return stockprice.get();
}
	}
