package com.seth.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seth.locationweb.entities.Location;
import com.seth.locationweb.service.locationService;

@Controller
public class LocationController {
	@Autowired
	locationService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location saveLocation = service.saveLocation(location);
		String msg = "Location Saved With ID " +saveLocation.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> allLocations = service.getAllLocations();
		modelMap.addAttribute("locations",allLocations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam ("id") int id, ModelMap modelMap) {
	String msg ="Location Deleted with ID " +id;
	
		Location locationbyID = service.getLocationbyID(id);
		service.deleteLocation(locationbyID);
		List<Location> allLocations = service.getAllLocations();
		modelMap.addAttribute("locations", allLocations);
		modelMap.addAttribute("msg", msg);
		return "displayLocations";
		
		
	}
	
	@RequestMapping("/editLocation")
	public String showUpdatePage(@RequestParam ("id") int id, ModelMap modelMap) {
	Location locationbyID = service.getLocationbyID(id);
	modelMap.addAttribute("location", locationbyID);
	return "editLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		service.updateLocation(location);
		String msg = "Location updated with id " + location.getId();
		List<Location> allLocations = service.getAllLocations();
		modelMap.addAttribute("locations", allLocations);
		modelMap.addAttribute("msg", msg);
		return "displayLocations";
	}
	
	
}
