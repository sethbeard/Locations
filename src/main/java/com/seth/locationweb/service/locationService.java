package com.seth.locationweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.seth.locationweb.entities.Location;

@Service
public interface locationService {
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationbyID(int id);
	List<Location> getAllLocations();
}
