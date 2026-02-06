package com.example.movie.api;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Movie {
	@NotNull
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    private String genre;
    private double rating;

    public Movie() {}

    public Movie(Long id, String name, String description, String genre, double rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.rating = rating;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
    

}
