package com.example.product.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pid")
	private int pid;
	
	@Column(name="sku")
	private String sku;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="descriptions")
	private String description;
	
	@Column(name="unitprice")
	private float unitprice;
	
	@Column(name="imageurl")
	private String imageurl;
	
	
	@Column(name="unitsinstock")
	private int unitsinstock;
	
	@Column(name="datecreated")
	private Date datecreated;
	
	@Column(name="lastupdated")
	private Date lastupdated;
	
	@Column(name="categoryid")
	private int categoryid;
	
	
	public Product() {}


	public Product(int pid, String sku, String pname, String description, float unitprice, String imageurl,
			int unitsinstock, Date datecreated, Date lastupdated, int categoryid) {
		super();
		this.pid = pid;
		this.sku = sku;
		this.pname = pname;
		this.description = description;
		this.unitprice = unitprice;
		this.imageurl = imageurl;
		this.unitsinstock = unitsinstock;
		this.datecreated = datecreated;
		this.lastupdated = lastupdated;
		this.categoryid = categoryid;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


	public int getUnitsinstock() {
		return unitsinstock;
	}


	public void setUnitsinstock(int unitsinstock) {
		this.unitsinstock = unitsinstock;
	}


	public Date getDatecreated() {
		return datecreated;
	}


	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}


	public Date getLastupdated() {
		return lastupdated;
	}


	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	
	
	
	
	
}
