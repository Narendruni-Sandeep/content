package com.nkxgen.mvc;
public class Product{
	private int prodNo,stock;
	private String productName,pFile;
	private double price;
	public int getProductNo(){
		return prodNo;
	}
	public void setProductNo(int p){
		prodNo=p;
	}
	public String getProductName(){
		return productName;
	}
	public void setProductName(String pn){
		productName=pn;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double pr){
		price=pr;
	}
	public int getStock(){
		return stock;
	}
	public void setStock(int s){
		stock=s;
	}
	public String getPFile(){
		return pFile;
	}
	public void setPFile(String pf){
		pFile=pf;
	}
}
	