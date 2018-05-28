package com.andana.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andana.Model.MenuHeader;
import com.andana.Model.ProductMaster;
import com.andana.Service.GeneralService;
import com.andana.repository.GeneralMenu;
import com.andana.repository.GeneralRepository;

@Service
@Transactional

public class GeneralServiceImpl implements GeneralService {

	@Autowired
	GeneralRepository generalRepository;
	@Autowired
	GeneralMenu generalMenu;

	@Override
	public List<ProductMaster> getMainProduct(Long i) {
		// TODO Auto-generated method stub
		return generalRepository.findByShowfirst(i);
	}

	@Override
	public List<MenuHeader> getMainMenu() {
		// TODO Auto-generated method stub
		return generalMenu.findAll();
	}

}
