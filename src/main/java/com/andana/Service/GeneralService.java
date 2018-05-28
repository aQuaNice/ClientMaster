package com.andana.Service;

import java.util.List;

import com.andana.Model.MenuHeader;
import com.andana.Model.ProductMaster;

public interface GeneralService {

	List<ProductMaster> getMainProduct(Long i);
	List<MenuHeader> getMainMenu();

}
