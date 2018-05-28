package com.andana.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_d_product")
public class ProductSubMaster {
	
	private Long id;
	private Long idhead;
	private String title;
	private String desc;
	private int type;
	private int idwarna;
	private int idsize;
	private int idimg;
	private int idprice;
	private int ideven;
	private int stat;
	private ProductMaster productMaster;

    @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdhead() {
		return idhead;
	}
	public void setIdhead(Long idhead) {
		this.idhead = idhead;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getIdwarna() {
		return idwarna;
	}
	public void setIdwarna(int idwarna) {
		this.idwarna = idwarna;
	}
	public int getIdsize() {
		return idsize;
	}
	public void setIdsize(int idsize) {
		this.idsize = idsize;
	}
	public int getIdimg() {
		return idimg;
	}
	public void setIdimg(int idimg) {
		this.idimg = idimg;
	}
	public int getIdprice() {
		return idprice;
	}
	public void setIdprice(int idprice) {
		this.idprice = idprice;
	}
	public int getIdeven() {
		return ideven;
	}
	public void setIdeven(int ideven) {
		this.ideven = ideven;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	
	
	//@ManyToOne
    //@JoinColumn(name="iditm",insertable = false, updatable = false)

	
	@ManyToOne
    @JoinColumn(name="idhead",insertable = false, updatable = false)

	public ProductMaster getProductMaster() {
		return productMaster;
	}
	public void setProductMaster(ProductMaster productMaster) {
		this.productMaster = productMaster;
	}



}
