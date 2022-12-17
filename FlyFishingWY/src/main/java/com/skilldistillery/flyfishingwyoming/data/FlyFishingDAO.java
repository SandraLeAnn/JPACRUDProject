package com.skilldistillery.flyfishingwyoming.data;

import java.util.List;

import com.skilldistillery.jpaflyfishingwyoming.entities.FlyFishing;

public interface FlyFishingDAO {

	public List<FlyFishing> findFlyFishingAll();
	
}
