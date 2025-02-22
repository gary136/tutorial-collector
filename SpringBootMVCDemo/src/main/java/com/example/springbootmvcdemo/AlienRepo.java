package com.example.springbootmvcdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springbootmvcdemo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	List<Alien> findByAname(String aname);

	List<Alien> findByAnameOrderByAidDesc(String aname);
	
	@Query("from Alien where aname = :name")
	List<Alien> find(@Param("name") String aname);
}
