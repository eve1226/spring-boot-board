package com.example.SpringBootBoard.repositories;

import com.example.SpringBootBoard.models.Restaurant;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestaurantsRepository {
    List<Restaurant> read();

    Restaurant detail(Integer pk);

    // @Insert("insert into restaurants(name, address, tel, menu) values(#{name}, #{address}, #{tel}, #{menu})")
    Integer create(Restaurant restaurant);

    Integer delete(Integer pk);
}