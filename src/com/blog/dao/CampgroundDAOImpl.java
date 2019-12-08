package com.blog.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.entity.Campground;

@Repository
public class CampgroundDAOImpl implements CampgroundDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Campground> getCampgrounds() {
		Session session = sessionFactory.getCurrentSession();
		Query<Campground> query = session.createQuery("FROM Campground ORDER BY name", Campground.class);
		List<Campground> campgrounds = query.getResultList();
		return campgrounds;
	}

	@Override
	public void saveCampground(Campground campground) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(campground);
	}

	@Override
	public Campground getCampground(int id) {
		Session session = sessionFactory.getCurrentSession();
		Campground campground = session.get(Campground.class, id);
		return campground;
	}

	@Override
	public void deleteCampground(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("DELETE FROM Campground WHERE id = :id");
		q.setParameter("id", id);
		q.executeUpdate();
	}

}
