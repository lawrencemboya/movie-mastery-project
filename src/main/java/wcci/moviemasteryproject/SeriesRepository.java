package wcci.moviemasteryproject;

import org.springframework.data.repository.CrudRepository;

public interface SeriesRepository extends CrudRepository<Series, Long> {

	Series findByTitle(String string);

}
