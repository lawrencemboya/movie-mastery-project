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
	private ActorRepository actorRepo;

	
	
//	private Series series;
	
	
	@Before
	public void setup() {
	
	Actor actorTest = new Actor ("name", "imageUrl", "dob", "pob");
	actorRepo.save(actorTest);
		
	Movie movieTest = new Movie ("title","link", "time");
	movieRepo.save(movieTest);
	
	entityManager.flush();
	entityManager.clear();
		
	}
	
	@Test
	public void shouldStartDataJpaTestFramework() {

	}
	
	@Test
	public void shouldSaveAndLoadActor() {
		assertThat(actorRepo.findByName("name").getName(), is("name"));
	}
	
//	@Test
//	public void shouldSaveAndLoadMovie() {
//		assertThat(movieRepo.findByTitle("title").getTitle(), is("title"));
//	}

}
