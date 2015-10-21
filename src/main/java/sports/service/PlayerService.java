package sports.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import sports.model.Player;
import sports.repository.PlayerRepository;

/**
 * Player service implementation
 * 
 * @author Cleo Pinto (@cleopinto)
 *
 */
@Service
public class PlayerService implements SportsService<Player> {

	@Autowired
	PlayerRepository playerRepository;

	@Override
	public List<Player> findAll() {
		return playerRepository.findAll();
	}

	@Override
	public Player findById(String id) {
		return playerRepository.findOne(id);
	}

	@Override
	public Player create(Player resource) {
		return playerRepository.save(resource);
	}

	@Override
	public Player delete(String id) {
		Player player = playerRepository.findOne(id);
		playerRepository.delete(player);
		return player;
	}

	@Override
	public Player update(Player resource) {
		Player player = playerRepository.findOne(resource.getId());
		BeanUtils.copyProperties(resource, player);
		return playerRepository.save(player);
	}

	@Override
	public Player patch(Player resource) {
		Player player = playerRepository.findOne(resource.getId());
		patchPlayer(resource, player);
		return playerRepository.save(player);
	}

	private void patchPlayer(Player source, Player target) {
		if (source.getJerseyNumber() != 0) {
			target.setJerseyNumber(source.getJerseyNumber());
		}
		if (!StringUtils.isEmpty(source.getName())) {
			target.setName(source.getName());
		}
	}

}
