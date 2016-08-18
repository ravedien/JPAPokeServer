package com.core.jpa.pokemon.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.core.jpa.pokemon.model.PokeType;

@Repository
public interface PokeTypeRepository extends CrudRepository<PokeType, Integer>{
	
}
