package com.paigeruppel.movies;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private MovieRepository movieRepo;
	
	@RequestMapping("/genres")
	public String fetchGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genreList";
	}
	
	@RequestMapping("/genre")
	public String fetchGenre(@RequestParam("id") long id, Model model) {
		model.addAttribute(genreRepo.findOne(id));
		return "genre";
	}
}
