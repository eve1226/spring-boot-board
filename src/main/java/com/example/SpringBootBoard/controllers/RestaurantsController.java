package com.example.SpringBootBoard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestaurantsController {
    @RequestMapping(value="/restaurant-list", method= RequestMethod.GET)
    @ResponseBody
    ModelAndView restaurantList(){
        return new ModelAndView("restaurant-list");
    }

    @RequestMapping(value="/restaurant-create", method= RequestMethod.GET)
    @ResponseBody
    ModelAndView restaurantCreate(){
        return new ModelAndView("restaurant-form");
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
