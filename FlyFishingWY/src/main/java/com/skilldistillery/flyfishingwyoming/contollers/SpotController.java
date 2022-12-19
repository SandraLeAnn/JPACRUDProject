package com.skilldistillery.flyfishingwyoming.contollers;

import java.util.List;

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
//	@GetMapping("searchSpot.do")
//	public ModelAndView getSpotKeyword(String keyword) {
//		System.out.println(keyword + "inside controller");
//		ModelAndView mv = new ModelAndView();
//		List<Spot> spt = dao.findSpotByKeyword(keyword);
//		mv.addObject("spot", spt);
//		mv.setViewName("spot");
//		return mv;
//		
//	}
	
	@GetMapping("getSpotPage.do")
	public ModelAndView getSpotById(int id) {
	System.err.println("inside" + id);
		ModelAndView mv = new ModelAndView();
		Spot s = dao.findById(id);
		mv.addObject("spot", s);
		mv.setViewName("spot");
		return mv;
	}
	@PostMapping("createSpot.do")
	public ModelAndView createSpot(Spot spot) {
		ModelAndView mv = new ModelAndView();
		Spot newSpot = dao.create(spot);
		mv.addObject("Spot", newSpot);
		mv.setViewName("createresult");
		return mv;
	} 
	
	
	@GetMapping("updateInProgresss.do")
	public ModelAndView updateInProg(Integer id) {
		System.out.println(id);
		ModelAndView mv = new ModelAndView();
		Spot spt = dao.findById(id);
		

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
	
	
	@PostMapping("deleteSpot.do")
		public ModelAndView deleteInProgress(int id) {
		System.err.println(id);
			ModelAndView mv = new ModelAndView();
			dao.deleteSpot(id);
			mv.setViewName("deleteresult");
			return mv;
			
		}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



