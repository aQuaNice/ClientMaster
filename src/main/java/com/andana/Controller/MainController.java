package com.andana.Controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.andana.Model.MenuHeader;
import com.andana.Model.ProductMaster;
import com.andana.Model.ReturnMessage;
import com.andana.Service.GeneralService;
import com.fasterxml.jackson.databind.ObjectMapper;
//import be.Admin.Model.Result;
@RestController
public class MainController {
	
	@Autowired
	GeneralService Generalservice;
	
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(value = { "", "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView AppMain() throws Exception{
		Long dataid = new Long(1);
		List<ProductMaster> Product = Generalservice.getMainProduct(dataid);
		ModelAndView modelAndView = new ModelAndView("landing");
		modelAndView.addObject("activePage", "landing/index");
		
		modelAndView.addObject("FirstProduct", Product);
		List<MenuHeader> Menu = Generalservice.getMainMenu();
		modelAndView.addObject("FirstMenu", Menu);
		System.out.println(mapper.writeValueAsString(Menu));
		return modelAndView;
	}
	
	@RequestMapping(value = { "/shop/{type}/{subtype}" }, method = RequestMethod.GET)
	public ModelAndView AppShop(@PathVariable Integer type,@PathVariable Integer subtype) throws Exception{
		Long dataid = new Long(1);
		List<ProductMaster> Product = Generalservice.getMainProduct(dataid);
		ModelAndView modelAndView = new ModelAndView("landing");
		modelAndView.addObject("activePage", "shop/index");
		modelAndView.addObject("FirstProduct", Product);
		return modelAndView;
	}
	
//	@RequestMapping(value ={"/checkAuth"}, method = RequestMethod.GET)
//	public ResponseEntity<?> MainController(@Valid @ModelAttribute String model, BindingResult bindingResult)throws IOException{
//		
//		ObjectMapper mapper = new ObjectMapper();
//		ReturnMessage respon = new ReturnMessage();
//		
//			try {
////				generalHandler.SetResponse(respon,"RE-0400");				
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				return new ResponseEntity<>(mapper.writeValueAsString(respon),HttpStatus.BAD_REQUEST);
////				e.printStackTrace();
//			}
////		}
//		
//		return new ResponseEntity(mapper.writeValueAsString(respon), HttpStatus.OK);
//	}

}
