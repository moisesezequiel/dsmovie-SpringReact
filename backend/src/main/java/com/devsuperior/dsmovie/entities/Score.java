package com.devsuperior.dsmovie.entities;



import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();//chave composta sem instanciar para não dar problema 

	private Double value;
	
	public Score() {
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
		//setar filme escolhido  para esse score
	}
	
	public void setUser(User user) {
		id.setUser(user);
		//setar usuario escolhido  
	}
	

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
