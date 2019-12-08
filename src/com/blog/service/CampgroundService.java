package com.blog.service;

import java.util.List;

import com.blog.entity.Campground;

public interface CampgroundService {
	
	public List<Campground> getCampgrounds();
	public void saveCampground(Campground campground);
	public Campground getCampground(int id);
	public void deleteCampground(int id);
	
}
