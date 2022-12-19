package com.skilldistillery.flyfishingwyoming.data;

import java.util.List;

import com.skilldistillery.jpaflyfishingwyoming.entities.Spot;

public interface SpotDAO {

//	public List<Spot> findAllSpots() throws SQLException;

	
	public Spot FindById(int id);
//	public List<Spot> findSpotByKeyword(String keyword);
	public Spot create(Spot spot);
	public Spot updateSpot(int id, Spot spot);
	public boolean deleteSpot( int id);
	
}
