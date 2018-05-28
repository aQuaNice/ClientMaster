package com.andana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andana.Model.MenuHeader;
//import com.andana.Model.ProductMaster;


public interface GeneralMenu extends JpaRepository<MenuHeader, Long> {
//	public List<MenuHeader> findByShowfirst(Long i);
}


