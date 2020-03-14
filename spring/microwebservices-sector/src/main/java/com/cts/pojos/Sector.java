package com.cts.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sector")
public class Sector {
	@Id
		private String id;
	private String sectorName;
	private String brief;
	@Override
	public String toString() {
		return "Sector [id=" + id + ", sectorName=" + sectorName + ", brief=" + brief + "]";
	}
	
			
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
}
			