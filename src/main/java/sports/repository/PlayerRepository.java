package sports.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import sports.model.Player;

/**
 * Mongo DB repository interface that will be used to query the mongo db
 * 
 * @author Cleo Pinto (@cleopinto)
 *
 */
@SuppressWarnings("unchecked")
@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

	void delete(Player deleted);

	List<Player> findAll();

	Player findOne(String id);

	Player save(Player saved);

}
