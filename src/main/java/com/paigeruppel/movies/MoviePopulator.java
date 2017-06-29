package com.paigeruppel.movies;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MoviePopulator implements CommandLineRunner {

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private MovieRepository movieRepo;

	@Override
	public void run(String... args) throws Exception {
		Genre comedy = new Genre("Comedy");
		Genre horror = new Genre("Horror");
		Genre animated = new Genre("Animated");
		
		genreRepo.save(comedy);
		genreRepo.save(horror);
		genreRepo.save(animated);
		
		Movie babyMama = new Movie(comedy, "Baby Mama", " Michael McCullers", "A successful, single businesswoman who dreams of having a baby discovers she is infertile and hires a working class woman to be her unlikely surrogate.");
		Movie getOut = new Movie(horror, "Get Out", "Jordan Peele", "It's time for a young African American to meet with his white girlfriend's parents for a weekend in their secluded estate in the woods, but before long, the friendly and polite ambience will give way to a nightmare.");
		Movie toyStory = new Movie(animated, "Toy Story", "John Lasseter", "A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room.");
		
		movieRepo.save(babyMama);
		movieRepo.save(getOut);
		movieRepo.save(toyStory);
	}

}
