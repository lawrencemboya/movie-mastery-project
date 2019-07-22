package wcci.moviemasteryproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Series {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Actor actor;
	
	private String title;
	private String imageUrl;
	private String recordLabel;
	

	public Series(Actor actor, String title, String imageUrl, String recordLabel) {
		this.actor = actor;
		this.title = title;
		this.imageUrl = imageUrl;
		this.recordLabel = recordLabel;
	}

	
	//why is this? *will make getTittle method in jpaTest yellow
	public Series(String title) {
		this.title = title;
	}
	
	
	//general constructor
	@SuppressWarnings("unused")
	private Series() {

	}
	
	
	public Long getId() {
		return id;
	}


	public Actor getActor() {
		return actor;
	}


	public String getTitle() {
		return title;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public String getRecordLabel() {
		return recordLabel;
	}
	
	
	
	
	
	
	
	
	
}
