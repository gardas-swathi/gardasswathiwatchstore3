package com.example.Watchstore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Watchstoreproduct {

	@Id
	private String productname;
	private String productdesc;
	private String productlink;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public String getProductlink() {
		return productlink;
	}
	public void setProductlink(String productlink) {
		this.productlink = productlink;
	}
	
}
