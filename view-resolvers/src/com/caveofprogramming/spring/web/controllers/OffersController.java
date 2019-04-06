package com.caveofprogramming.spring.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {
	
	@RequestMapping("/") ///Test
	public ModelAndView showHome(HttpSession session) {
		//session.setAttribute("name", "Harrisorris");
		Logger logger=Logger.getLogger(OffersController.class);
		
		ModelAndView mv= new ModelAndView("home");
		
		Map<String,Object> model= mv.getModel();
		
		model.put("name","River");
		logger.debug("Jai Ho-------------------------------------");
		return mv;
	}
}
