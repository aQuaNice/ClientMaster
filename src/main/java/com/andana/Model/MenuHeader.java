package com.andana.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbm_h_menu")
public class MenuHeader {
	
	
	private Long id;
	private String desc;
	private String url;
	private String icon;
	private int stat;
//	private Set<MenuDetail> menuDetail;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
//	 @OneToMany(mappedBy = "menuHeader", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
//	 public Set<MenuDetail> getMenuDetail() {
//			return menuDetail;
//		}
//		public void setMenuDetail(Set<MenuDetail> menuDetail) {
//			this.menuDetail = menuDetail;
//		}
}
