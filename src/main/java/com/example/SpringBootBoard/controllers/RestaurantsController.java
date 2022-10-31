package com.example.SpringBootBoard.controllers;

import com.example.SpringBootBoard.models.Restaurant;
import com.example.SpringBootBoard.repositories.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RestaurantsController {
    @Autowired
    private RestaurantsRepository restaurantsRepository;

    @RequestMapping(value="/restaurant-list", method= RequestMethod.GET)
    @ResponseBody
    ModelAndView restaurantList(){
        List<Restaurant> restaurants = restaurantsRepository.read();
        ModelAndView modelAndView = new ModelAndView("restaurant-list");
        modelAndView.addObject("restaurants", restaurants);
        return modelAndView;
    }

    @RequestMapping(value="/restaurant-create", method= RequestMethod.GET)
    @ResponseBody
    ModelAndView restaurantCreate(){
        return new ModelAndView("restaurant-form");
    }

    @RequestMapping(value="/restaurant-create", method= RequestMethod.POST)
    @ResponseBody
    String restaurantCreatePost(Restaurant restaurant){
        restaurantsRepository.create(restaurant);
        return "<script>" +
                "alert('등록되었습니다');"+
                "document.location.href='/restaurant-list';" +
                "</script>";
    }

    @RequestMapping(value="/restaurant-detail", method= RequestMethod.GET)
    @ResponseBody
    ModelAndView restaurantDetail(){
        return new ModelAndView("restaurant-form");
    }

    @RequestMapping(value="/restaurant-update", method= RequestMethod.GET)
    @ResponseBody
    ModelAndView restaurantUpdate(){
        return new ModelAndView("restaurant-form");
    }

}
