package com.skilldistillery.flyfishingwyoming.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpaflyfishingwyoming.entities.FlyFishing;

@Service
@Transactional
public class FlyFishingDaoImpl implements FlyFishingDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<FlyFishing> findFlyFishingAll() {
		String jpql = "Select * From FlyFishing";
		
		return em.createQuery(jpql, FlyFishing.class).getResultList();
	}
	

	
}
