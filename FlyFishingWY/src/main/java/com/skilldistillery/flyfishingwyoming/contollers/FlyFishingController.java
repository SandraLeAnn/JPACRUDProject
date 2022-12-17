package com.skilldistillery.flyfishingwyoming.contollers;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.flyfishingwyoming.data.FlyFishingDAO;

@Entity
public class FlyFishingController {

	
	@Autowired
	private FlyFishingDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String gotToHome(Model model) {
		return "home";
	}
	

	
}
