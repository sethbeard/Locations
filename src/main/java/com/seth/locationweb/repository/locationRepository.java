package com.seth.locationweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seth.locationweb.entities.Location;

public interface locationRepository extends JpaRepository<Location, Integer> {

}
