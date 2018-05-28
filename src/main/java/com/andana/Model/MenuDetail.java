package com.andana.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbm_d_menu")
public class MenuDetail{
	private Long id;
	private Long idhead;
	private String desc;
	private String url;
	private String icon;
	private int stat;
//	private MenuHeader menuHeader;
	
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	
//	@ManyToOne
//	@JoinColumn(name = "idhead", insertable = false, updatable = false)
//	public MenuHeader getMenuHeader() {
//		return menuHeader;
//	}
//	public void setMenuHeader(MenuHeader menuHeader) {
//		this.menuHeader = menuHeader;
//	}
	
}
