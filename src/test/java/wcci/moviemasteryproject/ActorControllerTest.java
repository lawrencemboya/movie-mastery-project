package wcci.moviemasteryproject;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ActorControllerTest {

	@InjectMocks
	private ActorController underTest;
	
	@Mock
	private ActorRepository actorRepo;

	@Mock
	private Actor mockActor;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldReturnListOfActors() {
		when(actorRepo.findAll()).thenReturn(Collections.singletonList(mockActor));
		assertThat(underTest.findAllActors(), contains(mockActor));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
