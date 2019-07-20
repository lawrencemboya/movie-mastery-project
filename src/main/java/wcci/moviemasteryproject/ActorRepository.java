package wcci.moviemasteryproject;

import org.springframework.data.repository.CrudRepository;



public interface ActorRepository extends CrudRepository<Actor, Long> {
	Actor findByName(String name);
}
