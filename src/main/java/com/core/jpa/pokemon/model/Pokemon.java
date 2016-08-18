package com.core.jpa.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pokeId;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="typeId",referencedColumnName="typeId")
	private PokeType pokeType;
	
//	private List<Weakness> weaknessList;
//	
//	private List<FastAttack> fastAttackList;
	
	private double weight;
	private double height;
	
//	private EvolutionRequirement evolutionRequirement;
	
//	private List<Pokemon> nextEvolution;
//	private List<Pokemon> previousEvolution;
	
	@Override
    public String toString() {
        return String.format(
                "Pokemon[pokeId=%d, name='%s', weight='%s', height='%s']",
                pokeId, name, weight, height);
    }
	
	public Pokemon() {
		super();
	}

	public Pokemon(String name, PokeType pokeType, double weight, double height) {
		super();
		this.name = name;
		this.pokeType = pokeType;
		this.weight = weight;
		this.height = height;
	}

	public Pokemon(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public int getPokeId() {
		return pokeId;
	}

	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PokeType getPokeType() {
		return pokeType;
	}

	public void setPokeType(PokeType pokeType) {
		this.pokeType = pokeType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
