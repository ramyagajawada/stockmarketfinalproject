package com.cts.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ipos")
public class Ipos {
	@Id
	private String id;
	private String companyName;
	private String stockExchange;
	private String pricePerShare;
	private String totalNumberOfShares;
	private String remarks;
	Date openDateTime=new Date();
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(String pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public String getTotalNumberOfShares() {
		return totalNumberOfShares;
	}
	public void setTotalNumberOfShares(String totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}
	@Override
	public String toString() {
		return "Ipos [id=" + id + ", companyName=" + companyName + ", stockExchange=" + stockExchange
				+ ", pricePerShare=" + pricePerShare + ", totalNumberOfShares=" + totalNumberOfShares + ", remarks="
				+ remarks + ", openDateTime=" + openDateTime + "]";
	}
}
		

		