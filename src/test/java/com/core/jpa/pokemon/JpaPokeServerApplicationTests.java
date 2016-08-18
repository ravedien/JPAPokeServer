package com.core.jpa.pokemon;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.core.jpa.pokemon.model.PokeType;
import com.core.jpa.pokemon.model.Pokemon;
import com.core.jpa.pokemon.service.PokeTypeRepository;
import com.core.jpa.pokemon.service.PokemonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaPokeServerApplicationTests {

	@Autowired
	PokemonRepository pokemonRepository;
	
	@Autowired
	PokeTypeRepository pokeTypeRepository;
	
	private static final Logger log = LoggerFactory.getLogger(JpaPokeServerApplicationTests.class);
	
	@Test
	public void savePokemon() {
		PokeType pokeType = createPokemonType();
		pokeTypeRepository.save(pokeType);
		
		Pokemon haunter = createPokemonDependencies();
		haunter.setPokeType(pokeType);
		
		pokemonRepository.save(haunter);
		
	}

	private Pokemon createPokemonDependencies() {
		Pokemon pokemon = new Pokemon();
		pokemon.setName("Haunter");
		pokemon.setWeight(0.1);
		pokemon.setHeight(1.6);
		return pokemon;
	}

	private PokeType createPokemonType() {
		return new PokeType("Ghost");
	}
//
//	private List<Weakness> createPokemonWeaknessList() {
//		List<Weakness> weaknessList = new ArrayList<Weakness>();
//		weaknessList.add(new Weakness("Ground"));
//		weaknessList.add(new Weakness("Psychic"));
//		weaknessList.add(new Weakness("Ghost"));
//		weaknessList.add(new Weakness("Dark"));
//		return weaknessList;
//	}
//
//	private List<FastAttack> createPokemonFastAttackList() {
//		List<FastAttack> fastAttackList = new ArrayList<FastAttack>();
//		fastAttackList.add(new FastAttack("Lick"));
//		fastAttackList.add(new FastAttack("Shadow Claw"));
//		return fastAttackList;
//	}

//	private List<Pokemon> createPokemonNextEvolutionList() {
//		List<FastAttack> fastAttackList = new ArrayList<FastAttack>();
//		fastAttackList.add(new FastAttack("Lick"));
//		fastAttackList.d(new FastAttack("Shadow Claw"));
//		return fastAttackList;ad
//	}
//
//	private List<Pokemon> createPokemonPreviousEvolutionList() {
//
//	}

}
