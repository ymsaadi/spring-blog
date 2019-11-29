package com.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.entiry.Campground;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	List<Campground> campgrounds = new ArrayList<Campground>();
		
	@RequestMapping("/")
	public String getLanding(Model model) {
		return "landing";
	}
	
	@RequestMapping("/campgrounds")
	public String getCampgrounds(Model model) {
		campgrounds.add(new Campground("Salmon Creek", "https://images.unsplash.com/photo-1508873696983-2dfd5898f08b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"));
		campgrounds.add(new Campground("Granite Hill", "https://images.unsplash.com/photo-1510312305653-8ed496efae75?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=600&q=60"));
		campgrounds.add(new Campground("Mountain Goat's Rest", "https://images.unsplash.com/photo-1471115853179-bb1d604434e0?ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"));
		model.addAttribute("campgrounds", campgrounds);
		return "campgrounds";
	}
	
	@RequestMapping("/campgrounds/new")
	public String getNewCampgound(Model model) {
		return "new";
	}
	
	@RequestMapping("/savecampground")
	public String saveCampground(@ModelAttribute("campground") Campground campground) {
		campgrounds.add(campground);
		return "redirect:/blog/campgrounds";
	}
	
}
