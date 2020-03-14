package com.cts.pojos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="managecompany")
public class ManageCompany {
	@Id
	public String companyName;
	
	public String ceoName;
	public String turnOver;
	public String boardOfDirectors;
	public String listOfStockExchange;
	public String stockCode;
	public String briefDescription;
	public Date date;
	public String sector;
	@Override
	public String toString() {
		return "ManageCompany [companyName=" + companyName + ", ceoName=" + ceoName + ", turnOver=" + turnOver
				+ ", boardOfDirectors=" + boardOfDirectors + ", listOfStockExchange=" + listOfStockExchange
				+ ", stockCode=" + stockCode + ", briefDescription=" + briefDescription + ", date=" + date + ", sector="
				+ sector + "]";
	}
	
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(String turnOver) {
		this.turnOver = turnOver;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public String getListOfStockExchange() {
		return listOfStockExchange;
	}
	public void setListOfStockExchange(String listOfStockExchange) {
		this.listOfStockExchange = listOfStockExchange;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getBriefDescription() {
		return briefDescription;
	}
	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
