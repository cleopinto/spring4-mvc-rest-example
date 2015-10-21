package sports.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/**
 * The model that will be used as @ResponseBody and @RequestBody. This will also
 * be used to transfer data to mongo DB through the mongo repository
 * 
 * @author Cleo Pinto (@cleopinto)
 *
 */
public class Player implements Serializable {

	private static final long serialVersionUID = 3354580137762445813L;

	@Id
	private String id;

	private int jerseyNumber;

	private String name;

	public Player() {
		super();
	}

	public Player(String id, int jerseyNumber, String name) {
		super();
		this.id = id;
		this.jerseyNumber = jerseyNumber;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
