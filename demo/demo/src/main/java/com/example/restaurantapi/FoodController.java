package com.example.restaurantapi;

import com.example.restaurantapi.entity.Food;
import com.example.restaurantapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public Food addFood(@RequestBody Food food) {
        return foodRepository.save(food);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }
}
