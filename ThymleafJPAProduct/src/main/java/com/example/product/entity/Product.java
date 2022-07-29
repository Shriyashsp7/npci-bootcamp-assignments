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
	private Integer pid;
	
	
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
	private Integer unitsinstock;
	
	@Column(name="datecreated")
	private Date datecreated;
	
	@Column(name="lastupdated")
	private Date lastupdated;
	
	@Column(name="categoryid")
	private Integer categoryid;
	
	
	public Product() {}


	public Product(Integer pid, String sku, String pname, String description, float unitprice, String imageurl,
			Integer unitsinstock, Date datecreated, Date lastupdated, Integer categoryid) {
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


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
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


	public Integer getUnitsinstock() {
		return unitsinstock;
	}


	public void setUnitsinstock(Integer unitsinstock) {
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


	public Integer getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	
	
	
	
	
}
