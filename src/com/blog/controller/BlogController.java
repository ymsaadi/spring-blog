package com.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.entity.Campground;
import com.blog.service.CampgroundService;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private CampgroundService campgroundService;
	
	@RequestMapping("/")
	public String getLanding(Model model) {
		return "landing";
	}
	
	@RequestMapping("/campgrounds")
	public String getCampgrounds(Model model) {
		List<Campground> campgrounds = campgroundService.getCampgrounds();
		model.addAttribute("campgrounds", campgrounds);
		return "campgrounds";
	}
	
	@RequestMapping("/campgrounds/new")
	public String getNewCampgound(Model model) {
		model.addAttribute("campground", new Campground());
		return "new";
	}
	
	@RequestMapping("/campgrounds/savecampground")
	public String saveCampground(@ModelAttribute("campground") Campground campground) {
		campgroundService.saveCampground(campground);
		return "redirect:/blog/campgrounds";
	}
	
	@RequestMapping("/campground")
	public String showCampground(@RequestParam("id") int id, Model model) {
		Campground campground = campgroundService.getCampground(id);
		model.addAttribute("campground", campground);
		return "show";
	}
	
	@RequestMapping("/campground/modify")
	public String showUpdateCampgroundForm(@RequestParam("id") int id, Model model) {
		Campground campground = campgroundService.getCampground(id);
		model.addAttribute("campground", campground);
		return "new";
	}
	
	@RequestMapping("/campground/delete")
	public String deleteCampground(@RequestParam("id") int id, Model model) {
		campgroundService.deleteCampground(id);
		return "redirect:/blog/campgrounds";
	}
}
