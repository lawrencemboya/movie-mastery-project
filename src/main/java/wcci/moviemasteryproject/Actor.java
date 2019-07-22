package wcci.moviemasteryproject;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	@OneToMany (mappedBy = "actor")
	private Collection<Series> series;
	
	
	
	private String name;
	private String imageUrl;
	private String dob;
	private String pob;

	
	public Actor(String name, String imageUrl, String dob, String pob) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.dob = dob;
		this.pob = pob;
		this.series = new ArrayList<Series>();
		
	}
	
	@SuppressWarnings("unused")
	private Actor() {
		
	}
	
	// Why is this?
	public Actor(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}

	//Why is this?
	public Collection<Series> getSeries() {
		return series;
	}


	public String getName() {
		return name;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public String getDob() {
		return dob;
	}


	public String getPob() {
		return pob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	

}
