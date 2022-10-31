package com.example.SpringBootBoard.repositories;

import com.example.SpringBootBoard.models.Restaurant;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestaurantsRepository {
    //List<Member> read();

    // @Insert("insert into restaurants(name, address, tel, menu) values(#{name}, #{address}, #{tel}, #{menu})")
    Integer create(Restaurant restaurant);
}