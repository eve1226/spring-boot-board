package com.example.SpringBootBoard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController{
    @RequestMapping(value="/", method= RequestMethod.GET)
    @ResponseBody
    String root(){
        return "<script>document.location.href='/restaurant-list';</script>";
    }

}