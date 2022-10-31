package com.example.SpringBootBoard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestaurantsController {
    @RequestMapping(value="/restaurant-list", method= RequestMethod.GET)
    @ResponseBody
    String restaurantList(){
        return "restaurant-list";
    }

}
