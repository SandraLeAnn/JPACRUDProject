package com.skilldistillery.flyfishingwyoming.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpaflyfishingwyoming.entities.Spot;

@Service
@Transactional
public class SpotDaoImpl implements SpotDAO {

//	@PersistenceContext
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAFlyFishingWyoming");
	private EntityManager em = emf.createEntityManager();

//	@Override
//	public List<Spot> findAllSpots() throws SQLException {
//		
//		List<Spot> spots = null;
//		System.out.println("inside impl");
//
//		String jpql = "Select s From Spot s";
//		
//		spots = em.createQuery(jpql, Spot.class).getResultList();
//		
//		return spots;
//	}

	@Override
	public Spot FindById(int id) {
		return em.find(Spot.class, id);
//		String jpql = "SELECT s FROM Spot s WHERE s.id = :id";
//		System.out.println(id);
//
//		Spot spot = em.createQuery(jpql, Spot.class).setParameter("id", id).getSingleResult();
//
//		System.out.println(spot);
	}
//@Override
//public List<Spot> findSpotByKeyword(String keyword) {
//	// TODO Auto-generated method stub
//	return null;
//}

	@Override
	public Spot create(Spot spot) {
		em.getTransaction().begin();
		em.persist(spot);
		em.flush();
		em.getTransaction().commit();
		return spot;
	}

	@Override
	public Spot updateSpot(int id, Spot spot) {
		
		System.out.println(spot);
		System.out.println(id);
		
		em.getTransaction().begin();
		
		Spot managedSpot = em.find(Spot.class, id);

		managedSpot.setName(spot.getName());
		managedSpot.setDescription(spot.getDescription());
		managedSpot.setLocation(spot.getLocation());
		managedSpot.setWaterType(spot.getWaterType());
		managedSpot.setFish(spot.getFish());
		managedSpot.setImageURL(spot.getImageURL());
		
		em.flush();
		em.getTransaction().commit();
		return managedSpot;
	}

//
//
//@Override
//public Spot deleteSpot(Spot spot) {
//	Spot spt = em.find(Spot.class, 1);
//	em.getTransaction().begin();
//
//	em.remove(spt); 
//
//	em.getTransaction().commit();
//
//	spt.getName();
//	
//	return null;
//}
}
