package com.skilldistillery.jpaflyfishingwyoming.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpotTest {

	private Spot spot;
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAFlyFishingWyoming");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		spot = em.find(Spot.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		spot = null;
	}
	
	
	@DisplayName("testing_the_spot_entity_to_the_database")
	@Test
	void test_Film_entity_mappings() {
		
//		mysql> select * from spot where id = 1;
//		+----+----------------+----------------+-----------------+------------+----------+-------+---------+
//		| id | name           | description     | water_type | location | fish  | img_url |
//		+----+----------------+-----------------+------------+----------+-------+---------+
//		|  1 | Colorado River | Colorados river | river      | colorado | brown | NULL    |
//		+----+----------------+-------------+----------+-------+---------+
//		1 row in set (0.01 sec)
		
		assertNotNull(spot);
		assertEquals("Colorado River", spot.getName());
	
		
		
	}

}
