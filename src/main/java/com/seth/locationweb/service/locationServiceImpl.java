package com.seth.locationweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seth.locationweb.entities.Location;
import com.seth.locationweb.repository.locationRepository;


@Service
public class locationServiceImpl implements locationService {
	
	@Autowired
	private locationRepository locRepo;
	
	public locationRepository getLocRepo() {
		return locRepo;
	}

	public void setLocRepo(locationRepository locRepo) {
		this.locRepo = locRepo;
	}

	@Override
	public Location saveLocation(Location location) {
		return locRepo.save(location);

	}

	@Override
	public Location updateLocation(Location location) {
		return locRepo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locRepo.delete(location);
	}

	@Override
	public Location getLocationbyID(int id) {
		return  locRepo.findById(id).get();
		
	}

	@Override
	public List<Location> getAllLocations() {
		return (List<Location>) locRepo.findAll();
	}

}
