package com.paigeruppel.movies;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	//needs name of instance variable in referenced class in order to know what to map by
	@OneToMany(mappedBy="genre")
	private Set<Movie> movies;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	private Genre() {}

	public Genre(String name) {
		this.name = name;
	}
	
	
}
