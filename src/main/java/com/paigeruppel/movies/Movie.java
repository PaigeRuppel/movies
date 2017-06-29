package com.paigeruppel.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Genre genre;

	private String title;
	private String description;
	private String director;

	public Long getId() {
		return id;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getDirector() {
		return director;
	}

	private Movie() {
	}

	public Movie(Genre genre, String title, String director, String description) {
		this.genre = genre;
		this.title = title;
		this.director = director;
		this.description = description;
	}

}
