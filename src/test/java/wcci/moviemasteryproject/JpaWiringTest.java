package wcci.moviemasteryproject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest

public class JpaWiringTest {
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	private MovieRepository movieRepo;
	
	@Autowired
	private SeriesRepository seriesRepo;
	
	@Autowired
	private ActorRepository actorRepo;

	private Actor vinDisel;
	private Series fastAndFuriousMovieSeries;

	
	@Before
	public void setup() {
	
	Actor actorTest = new Actor ("vinDisel", "imageUrl", "dob", "pob");
	actorRepo.save(actorTest);
	
	Series seriesTest = new Series(vinDisel, "fastAndFuriousMovieSeries", "imageUrl", "recordLabel");
	seriesRepo.save(seriesTest);
		
	Movie movieTest = new Movie (fastAndFuriousMovieSeries, "theFastAndFuriousMovie","link", "time");
	movieRepo.save(movieTest);
	
	entityManager.flush();
	entityManager.clear();
		
	}
	
	@Test
	public void shouldStartDataJpaTestFramework() {

	}
	
	@Test
	public void shouldSaveAndLoadActor() {
		assertThat(actorRepo.findByName("vinDisel").getName(), is("vinDisel"));
	}
	
	@Test
	public void shouldSaveAndLoadSeries() {
		assertThat(seriesRepo.findByTitle("fastAndFuriousMovieSeries").getTitle(), is("fastAndFuriousMovieSeries"));
	}
	
	@Test
	public void shouldSaveAndLoadMovie() {
		assertThat(movieRepo.findByTitle("theFastAndFuriousMovie").getTitle(), is("theFastAndFuriousMovie"));
	}

	
	//ADD TEST- shouldAddAnotherMovieToSeries and shouldAddAnotherSeriesToActor
}
