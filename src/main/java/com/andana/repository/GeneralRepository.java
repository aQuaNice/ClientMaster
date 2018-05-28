package com.andana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andana.Model.ProductMaster;


public interface GeneralRepository extends JpaRepository<ProductMaster, Long> {
	public List<ProductMaster> findByShowfirst(Long i);
}


