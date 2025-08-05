package com.example.restaurantapi.;

import com.example.restaurantapi.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
