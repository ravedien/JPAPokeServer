package com.core.jpa.pokemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
//	private List<Type> TypeList;
//	
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
                "Pokemon[id=%d, name='%s', weight='%s', height='%s']",
                id, name, weight, height);
    }
	
	public Pokemon() {
		super();
	}
	
	public Pokemon(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Type> getTypeList() {
//		return TypeList;
//	}
//
//	public void setTypeList(List<Type> typeList) {
//		TypeList = typeList;
//	}
//
//	public List<Weakness> getWeaknessList() {
//		return weaknessList;
//	}
//
//	public void setWeaknessList(List<Weakness> weaknessList) {
//		this.weaknessList = weaknessList;
//	}
//
//	public List<FastAttack> getFastAttackList() {
//		return fastAttackList;
//	}
//
//	public void setFastAttackList(List<FastAttack> fastAttackList) {
//		this.fastAttackList = fastAttackList;
//	}

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

//	public EvolutionRequirement getEvolutionRequirement() {
//		return evolutionRequirement;
//	}
//
//	public void setEvolutionRequirement(EvolutionRequirement evolutionRequirement) {
//		this.evolutionRequirement = evolutionRequirement;
//	}

}
