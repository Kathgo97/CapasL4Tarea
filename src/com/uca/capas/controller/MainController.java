package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product prod = new Product();
		mav.addObject("product", prod);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute Product prod, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.addObject("message", "Error al registrar");
			mav.setViewName("main");
		}else {
			mav.addObject("message", "Producto agregado con exito!");
			mav.setViewName("form");
		}
		return mav;
	}
	
}
