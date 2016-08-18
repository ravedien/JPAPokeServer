package com.core.jpa.pokemon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.core.jpa.pokemon.model.Pokemon;
import com.core.jpa.pokemon.service.PokemonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaPokeServerApplicationTests {

	@Autowired
	PokemonRepository pokemonRepository;
	
	private static final Logger log = LoggerFactory.getLogger(JpaPokeServerApplicationTests.class);
	
	@Test
	public void savePokemon() {
		pokemonRepository.save(createPokemonDependencies());

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Pokemon pokemon : pokemonRepository.findAll()) {
			log.info(pokemon.toString());
		}
		
	}

	private Pokemon createPokemonDependencies() {
		Pokemon pokemon = new Pokemon();
		pokemon.setName("Haunter");
		pokemon.setWeight(0.1);
		pokemon.setHeight(1.6);
		return pokemon;
	}

//	private List<Type> createPokemonTypeList() {
//		List<Type> typeList = new ArrayList<Type>();
//		typeList.add(new Type("Ghost"));
//		typeList.add(new Type("Poison"));
//		return typeList;
//	}
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
