package com.davidonus.demo;

import org.springframework.data.repository.CrudRepository;
import com.davidonus.demo.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

}