package schiffeversenken.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import schiffeversenken.entity.Game;

@Repository
public interface ShipRepository extends CrudRepository<Game, Long> {
}
