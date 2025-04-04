package com.codedecode.restaurantListing.service;

import com.codedecode.restaurantListing.dto.RestaurantDTO;

import com.codedecode.restaurantListing.entity.Restaurant;
import com.codedecode.restaurantListing.mapper.RestaurantMapper;
import com.codedecode.restaurantListing.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants =  restaurantRepo.findAll();
        return restaurants.stream().map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDto).collect(Collectors.toList());
    }

    public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO) {
      Restaurant savedRestaurant = restaurantRepo.save(RestaurantMapper.INSTANCE.mapRestaurantDtoToRestaurant(restaurantDTO));
      return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(savedRestaurant);
    }

    public ResponseEntity<RestaurantDTO> fetchRestaurantById(Integer id) {
        Optional<Restaurant> restaurant = restaurantRepo.findById(id);
        return restaurant.map(value -> new ResponseEntity<>(RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(value), HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}
