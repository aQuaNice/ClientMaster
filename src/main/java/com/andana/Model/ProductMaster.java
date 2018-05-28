package com.andana.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_m_product")
public class ProductMaster {
	
	private Long id;
	private Long idhead;
	private String title;
	private String desc;
	private Long showfirst;
	private String mainimg;
	private int stat;
	private ProductKategory kategory;

	
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
	public Long getShowfirst() {
		return showfirst;
	}
	public void setShowfirst(Long showfirst) {
		this.showfirst = showfirst;
	}

	public String getMainimg() {
		return mainimg;
	}
	public void setMainimg(String mainimg) {
		this.mainimg = mainimg;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	
	@ManyToOne
    @JoinColumn(name="idhead",insertable = false, updatable = false)
	public ProductKategory getKategory() {
		return kategory;
	}
	public void setKategory(ProductKategory kategory) {
		this.kategory = kategory;
	}
	
//	@OneToMany(mappedBy = "orderhead", cascade = CascadeType.ALL)


}
