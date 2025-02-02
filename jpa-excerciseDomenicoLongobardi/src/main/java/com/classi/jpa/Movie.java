package com.classi.jpa;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "movie")
public class Movie extends Base implements Serializable{

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "movie_id", unique = true)
//	private int id;
	
	@Column(name = "title", unique = true)
	private String title;
	
	@Column(name = "release_year", unique = true)
	private int releaseYear;
	
	
	@Column(name = "genre_id", unique = false)
	private int genreId;
	
	@ManyToMany
	@JoinTable(
			name = "actedInMovies",
			joinColumns = @JoinColumn(name = "movie_id"),
			inverseJoinColumns = @JoinColumn(name = "actor_id")
			)
//	@ManyToMany(mappedBy = "actedInMovies")
	Set<Actor> actorsInTheMovie;
	
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public Set<Actor> getActorsInTheMovie() {
		return actorsInTheMovie;
	}
	public void setActorsInTheMovie(Set<Actor> actorsInTheMovie) {
		this.actorsInTheMovie = actorsInTheMovie;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", releaseYear=" + releaseYear + ", genreId=" + genreId + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
