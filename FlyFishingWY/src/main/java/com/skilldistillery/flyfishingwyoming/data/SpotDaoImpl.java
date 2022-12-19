package com.skilldistillery.flyfishingwyoming.data;

import java.util.List;

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

	@Override
	public Spot findById(int id) {
		return em.find(Spot.class, id);
//		String jpql = "SELECT s FROM Spot s WHERE s.id = :id";
//		System.out.println(id);
//
//		Spot spot = em.createQuery(jpql, Spot.class).setParameter("id", id).getSingleResult();
//
//		System.out.println(spot);
	}

//	@Override
//	public List<Spot> findSpotByKeyword(String keyword) {
//		System.out.println(keyword);
//		String jpql = "SELECT s FROM Spot s WHERE name LIKE :keyword OR description LIKE :keyword";
//		
//		List<Spot> searchList = em.createQuery(jpql, Spot.class)
//				.setParameter("keyword", ("%" + keyword + "%"))
//				.getResultList();
//		
//		System.out.println(searchList);
//		return searchList;
//	}

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

	@Override
	public boolean deleteSpot(int id) {
		em.getTransaction().begin();
		// create a boolean to track if the object has been deleted or not
		boolean isSpotDeleted = false;

		// find the spot object by id in order to delete it
		Spot spt = em.find(Spot.class, id);

		// if the object isnt null then move forward with deleting
		if (spt != null) {
			// remove the spot from the entity manager(stack)
			em.remove(spt);
			em.flush();

			// if the enitity manager no longer contains the object in question ...
			if (!em.contains(spt)) {
				// then set the boolean to true as it was deleted successfully
				isSpotDeleted = true;

			}
		}

		// else if it is null, does not exist do nothing and return false
		em.getTransaction().commit();
		return isSpotDeleted;

	}
}
