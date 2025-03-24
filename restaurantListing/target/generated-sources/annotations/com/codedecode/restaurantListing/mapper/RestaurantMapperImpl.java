package com.codedecode.restaurantListing.mapper;

import com.codedecode.restaurantListing.dto.RestaurantDTO;
import com.codedecode.restaurantListing.entity.Restaurant;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-24T19:12:56+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public Restaurant mapRestaurantDtoToRestaurant(RestaurantDTO restaurantDto) {
        if ( restaurantDto == null ) {
            return null;
        }

        Restaurant restaurant = new Restaurant();

        restaurant.setId( restaurantDto.getId() );
        restaurant.setName( restaurantDto.getName() );
        restaurant.setAddress( restaurantDto.getAddress() );
        restaurant.setCity( restaurantDto.getCity() );
        restaurant.setRestaurantDescription( restaurantDto.getRestaurantDescription() );

        return restaurant;
    }

    @Override
    public RestaurantDTO mapRestaurantToRestaurantDto(Restaurant restaurant) {
        if ( restaurant == null ) {
            return null;
        }

        RestaurantDTO restaurantDTO = new RestaurantDTO();

        restaurantDTO.setId( restaurant.getId() );
        restaurantDTO.setName( restaurant.getName() );
        restaurantDTO.setAddress( restaurant.getAddress() );
        restaurantDTO.setCity( restaurant.getCity() );
        restaurantDTO.setRestaurantDescription( restaurant.getRestaurantDescription() );

        return restaurantDTO;
    }
}
