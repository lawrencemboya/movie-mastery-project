package wcci.moviemasteryproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

//why this class does not need import entities and import repositories? Is it a packaging issue?

@Service
public class Initializer implements CommandLineRunner {
	
	@Autowired
	private MovieRepository movieRepo;
	
	@Autowired
	private SeriesRepository seriesRepo;
	
	@Autowired
	private ActorRepository actorRepo;

	Series fastAndFuriousMovieSeries;
	Series avengersSeries;

	Actor vinDisel;
	Actor robertDowney;


	@Override
	public void run(String... args) throws Exception {
		populateMovie();
	}

	public void populateMovie() {
		Movie fastAndFurious1 = new Movie(fastAndFuriousMovieSeries, "title", "link", "time");
		movieRepo.save(fastAndFurious1);
		
		Movie fastAndFurious2 = new Movie (fastAndFuriousMovieSeries, "title", "link", "time");
		movieRepo.save(fastAndFurious2);
		
		Movie avengers1 = new Movie (avengersSeries, "title", "link", "time");
		movieRepo.save(avengers1);
		
		Movie avengers2 = new Movie (avengersSeries, "title", "link", "time");
		movieRepo.save(avengers2);
	}
	
	public void populateSeries() {
		Series fastAndFuriousSeries = new Series(vinDisel, "title", "url", "studio");
		seriesRepo.save(fastAndFuriousSeries);
		
		Series avengersSeries = new Series(robertDowney, "title", "url", "studio");
		seriesRepo.save( avengersSeries);
	}
	
	public void populateActor() {
		vinDisel = new Actor ("Vin Disel", "imageUrl", "dateOfBirth", "homeTown");
		actorRepo.save(vinDisel);
				
		robertDowney = new Actor ("Robert Downey Jr", "imageUrl", "dateOfBirth", "homeTown");
		actorRepo.save(robertDowney);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
