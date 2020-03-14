package com.cts.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockprice")
public class StockPrice {
	@Id
		private String companyCode;
	private String stockExchange;  
	private String currentPrice;
	Date openDateTime=new Date();
	@Override
	public String toString() {
		return "StockPrice [companyCode=" + companyCode + ", stockExchange=" + stockExchange + ", currentPrice="
				+ currentPrice + ", openDateTime=" + openDateTime + "]";
	}
	
	
		public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}
}
	
		