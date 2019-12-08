package com.blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.CampgroundDAO;
import com.blog.entity.Campground;

@Service
public class CampgroundServiceImpl implements CampgroundService {
	
	@Autowired
	private CampgroundDAO campgroundDAO;
	
	@Override
	@Transactional
	public List<Campground> getCampgrounds() {
		return campgroundDAO.getCampgrounds();
	}

	@Override
	@Transactional
	public void saveCampground(Campground campground) {
		campgroundDAO.saveCampground(campground);
	}

	@Override
	@Transactional
	public Campground getCampground(int id) {
		return campgroundDAO.getCampground(id);
	}

	@Override
	@Transactional
	public void deleteCampground(int id) {
		campgroundDAO.deleteCampground(id);
	}
	
}
