package com.core.jpa.pokemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PokeType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int typeId;
	private String type;
	
	
	@OneToMany(mappedBy="pokeType",targetEntity=Pokemon.class,fetch=FetchType.EAGER)
	private List<Pokemon> pokemonList;
		
	@Override
    public String toString() {
        return String.format(
        		"PokeType[typeId=%d, name='%s']",
                typeId, type);
    }
	
	
	public PokeType() {
		super();
	}


	public PokeType(String type, List<Pokemon> pokemonList) {
		super();
		this.type = type;
		this.pokemonList = pokemonList;
	}


	public PokeType(String type) {
		super();
		this.type = type;
	}


	public int getTypeId() {
		return typeId;
	}


	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public List<Pokemon> getPokemonList() {
		return pokemonList;
	}


	public void setPokemonList(List<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}
	
}
