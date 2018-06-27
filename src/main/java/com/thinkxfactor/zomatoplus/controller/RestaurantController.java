package com.thinkxfactor.zomatoplus.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import com.thinkxfactor.zomatoplus.model.Restaurant;
import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.repositories.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repositories.UserRepository;
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;
	@PostMapping("/add")
	public User addRestaurant(@RequestBody Restaurant restaurant) {
		User persistedRestaurant=restaurantRepository.save(restaurant);
				
				return persistedRestaurant;
	}
		@GetMapping("/getAll")
		public List<User> getAll(){
			List<User> listofrestaurants=restaurantRepository.findAll();
			return listofrestaurants;
		}
	/*@PostMapping("/create")
	public Restaurant restaurantCreate(@RequestBody Restaurant restaurant) {
		System.out.println(restaurant.toString());
		
		return restaurant;
	}
	@GetMapping("/getAll")
	public List<Restaurant> restaurantList(){
		List<Restaurant> rst=new ArrayList<>();
		Restaurant rst1,rst2,rst3;
		rst1=new Restaurant("PapaDaDhaba");
		rst2=new Restaurant("India Restaurant");
		rst3=new Restaurant("City Restaurant");
		rst.add(rst1);
		rst.add(rst2);
		rst.add(rst3);
		
		
		
		return rst;
	}
	 */
}
