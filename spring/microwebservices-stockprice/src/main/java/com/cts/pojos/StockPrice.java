package com.cts.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="stockprice")
public class StockPrice {
	
		private String companyCode;
		@Id
		private String stockExchange;  
		private Integer currentPrice;
		private String date;
		private String time;
		private String uploadFile;
	
		@Override
		public String toString() {
			return "StockPrice [companyCode=" + companyCode + ", stockExchange=" + stockExchange + ", currentPrice="
					+ currentPrice + ", date=" + date + ", time=" + time + ", uploadFile=" + uploadFile
					+ ", StockExchangeList=" + StockExchangeList + "]";
		}

	

		
		
		public String getUploadFile() {
			return uploadFile;
		}

		public void setUploadFile(String uploadFile) {
			this.uploadFile = uploadFile;
		}

		

		
	
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
	
	@Transient
	List<StockExchange> StockExchangeList;
	
	public List<StockExchange> getStockExchangeList() {
		return StockExchangeList;
	}


	public void setStockExchangeList(List<StockExchange> stockExchangeList) {
		StockExchangeList = stockExchangeList;
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
	public Integer getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Integer currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	



}
	
		