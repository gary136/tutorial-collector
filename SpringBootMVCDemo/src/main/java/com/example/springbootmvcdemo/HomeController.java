package com.example.springbootmvcdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springbootmvcdemo.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String home() {
//		System.out.println("home page requested");
//		return "index.jsp";
		return "index";
	}
	
//	old
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		return "result.jsp";
//	}
	
//	spring boot mvc
//	@RequestMapping("add")
////	public String add(@RequestParam("num1")int i, @RequestParam("num2")int j) {
//	public ModelAndView add(@RequestParam("num1")int i, @RequestParam("num2")int j) {
//		int k = i + j;
////		HttpSession session = req.getSession();
////		session.setAttribute("k", k);
//		ModelAndView mv = new ModelAndView("result");
////		mv.setViewName("result");
//		mv.addObject("k", k);
////		return "result.jsp";
//		return mv;
//	}
	
	@GetMapping("getaliens")
	public String getAliens(Model m) {
//		List<Alien> aliens = Arrays.asList(new Alien(1, "Navin"), new Alien(2, "Kevin"));
//		JpaRepository
		m.addAttribute("result", repo.findAll());
//		return aliens.toString();
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m) {
		m.addAttribute("result", repo.getOne(aid));
		return "showAliens";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname, Model m) {
//		m.addAttribute("result", repo.findByAname(aname));
//		m.addAttribute("result", repo.findByAnameOrderByAidDesc(aname));
		m.addAttribute("result", repo.find(aname));
		return "showAliens";
	}
	
//	model mapping
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i, @RequestParam("num2")int j, Model m) {
		int k = i + j;
		m.addAttribute("k", k);
		return "result";
	}
	
//	@RequestMapping("addAlien")
//	@RequestMapping(value="addAlien", method=RequestMethod.POST)
//	@GetMapping("addAlien")
	@PostMapping("addAlien")
//	public String addAlien(@RequestParam("aid")int aid, @RequestParam("aname")String aname, Model m) {
//	public String addAlien(@ModelAttribute Alien a, Model m) {
	public String addAlien(@ModelAttribute Alien a) {
//	public String addAlien(Alien a) {
//	public String addAlien(@ModelAttribute("a1") Alien a) {
//		m.addAttribute("alien", a);
		repo.save(a);
		return "result";
	}
	
}
