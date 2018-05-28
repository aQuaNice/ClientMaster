package com.andana.Controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.andana.Model.ReturnMessage;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class RegisterController {
	
	
	@RequestMapping(value ="/get-reg", method = RequestMethod.GET)
	public ModelAndView getreg() throws Exception {
		ModelAndView modelAndView = new ModelAndView("reglog/register");
//		// modelAndView.addObject("Page", page);
//		List<PcsModel> lcpcs = generalService.getAllPcs();
//		List<VolModel> lcvol = generalService.getAllvol();
//		List<KategoryModel> lckat = generalService.getAllkat();
//		List<QtyModel> lcqty = generalService.getAllqty();
//		modelAndView.addObject("Pcs", lcpcs);
//		modelAndView.addObject("Vol", lcvol);
//		modelAndView.addObject("Kat", lckat);
//		modelAndView.addObject("Qty", lcqty);
//		return modelAndView;
		return modelAndView;
	}
	
	@RequestMapping(value ="/get-log", method = RequestMethod.GET)
	public ModelAndView getlog() throws Exception {
		ModelAndView modelAndView = new ModelAndView("reglog/login");
//		// modelAndView.addObject("Page", page);
//		List<PcsModel> lcpcs = generalService.getAllPcs();
//		List<VolModel> lcvol = generalService.getAllvol();
//		List<KategoryModel> lckat = generalService.getAllkat();
//		List<QtyModel> lcqty = generalService.getAllqty();
//		modelAndView.addObject("Pcs", lcpcs);
//		modelAndView.addObject("Vol", lcvol);
//		modelAndView.addObject("Kat", lckat);
//		modelAndView.addObject("Qty", lcqty);
//		return modelAndView;
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/setRegist", method = RequestMethod.POST, headers = "content-type=application/json")
	public ResponseEntity<?> RegistController(@Valid @ModelAttribute String model, BindingResult bindingResult)throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnMessage respon = new ReturnMessage();
			try {
//				generalHandler.SetResponse(respon,"RE-0400");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<>(mapper.writeValueAsString(respon),HttpStatus.BAD_REQUEST);
//				e.printStackTrace();
			}		
		return new ResponseEntity(mapper.writeValueAsString(respon), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getLogin", method = RequestMethod.POST, headers = "content-type=application/json")
	public ResponseEntity<?> LoginController(@Valid @ModelAttribute String model, BindingResult bindingResult)throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		ReturnMessage respon = new ReturnMessage();
			try {
//				generalHandler.SetResponse(respon,"RE-0400");				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<>(mapper.writeValueAsString(respon),HttpStatus.BAD_REQUEST);
//				e.printStackTrace();
			}		
		return new ResponseEntity(mapper.writeValueAsString(respon), HttpStatus.OK);
	}
	
	

}
