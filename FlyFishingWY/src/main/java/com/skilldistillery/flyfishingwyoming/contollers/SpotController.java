package com.skilldistillery.flyfishingwyoming.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.flyfishingwyoming.data.SpotDAO;
import com.skilldistillery.jpaflyfishingwyoming.entities.Spot;

@Controller
public class SpotController {

	
	@Autowired
	private SpotDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String gotToHome(Model model) {
		return "home";
	}
	@RequestMapping(path = {"goToCreateForm.do"})
	public String goToCreateForm() {
		System.out.println("inside go to create form call");
		return "createform";
	}
	@RequestMapping(path = {"goToUpdate.do"})
	public String goToUpdate() {
		return "updateSpot";
	}
//	@GetMapping(path= { "getSpots.do"})
//	public ModelAndView getAll() throws SQLException {
//		System.out.println("were inside controller method");
//		ModelAndView mv = new ModelAndView();
//		List<Spot> spots = dao.findAllSpots();
//		mv.addObject(spots);
//		mv.setViewName("home");
//		
//
//		return mv; 
//	}
	
	
	@GetMapping("getSpot.do")
	public ModelAndView getSpotById(int id) {
		ModelAndView mv = new ModelAndView();
		Spot s = dao.FindById(id);
		mv.addObject("spot", s);
		mv.setViewName("home");
		return mv;
	}
	@PostMapping("createSpot.do")
	public ModelAndView createSpot(Spot spot) {
		ModelAndView mv = new ModelAndView();
		dao.create(spot);
		mv.setViewName("createresult");
		return mv;
	}
	
	
	@GetMapping("updateInProgresss.do")
	public ModelAndView updateInProg(Integer id) {
		System.out.println(id);
		ModelAndView mv = new ModelAndView();
		Spot spt = dao.FindById(id);
		

		mv.addObject("spot", spt);
		mv.setViewName("updateSpot");
		return mv;
	}
	@PostMapping("updateSpot.do")
	public ModelAndView updatedSpot(Integer id, Spot spot) {
		
		System.out.println("inside post request");
		System.out.println("Id" + id);
		System.out.println("Spot" + spot);
	ModelAndView mv = new ModelAndView();
	dao.updateSpot(id, spot);
	mv.setViewName("home");
	return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


