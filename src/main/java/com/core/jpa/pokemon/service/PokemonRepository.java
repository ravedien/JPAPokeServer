package com.core.jpa.pokemon.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.core.jpa.pokemon.model.Pokemon;


@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{
	
	List<Pokemon> findById(int id);
	
}
