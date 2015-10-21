package sports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sports.common.SportsURIConstants;
import sports.model.Player;
import sports.service.SportsService;

/**
 * Rest controller to support Football Player APIs
 * 
 * @author Cleo Pinto (@cleopinto)
 *
 */
@RestController
@RequestMapping(value = SportsURIConstants.FOOTBALL_PATH)
public class FootballPlayerController {

	@Autowired
	SportsService<Player> playerService;

	@RequestMapping(value = SportsURIConstants.GET_PLAYER, method = RequestMethod.GET)
	public Player getPlayer(@PathVariable("id") String id) {
		return playerService.findById(id);
	}

	@RequestMapping(value = SportsURIConstants.GET_ALL_PLAYERS, method = RequestMethod.GET)
	public List<Player> getAllPlayers() {
		return playerService.findAll();
	}

	@RequestMapping(value = SportsURIConstants.UPDATE_PLAYER, method = RequestMethod.PUT)
	public Player updatePlayer(@PathVariable String id, @RequestBody Player player) {
		return playerService.update(player);
	}

	@RequestMapping(value = SportsURIConstants.PATCH_PLAYER, method = RequestMethod.PATCH)
	public Player patchPlayer(@PathVariable String id, @RequestBody Player player) {
		player.setId(id);
		return playerService.patch(player);
	}

	@RequestMapping(value = SportsURIConstants.CREATE_PLAYER, method = RequestMethod.POST)
	public Player create(@RequestBody Player player) {
		return playerService.create(player);
	}
}
