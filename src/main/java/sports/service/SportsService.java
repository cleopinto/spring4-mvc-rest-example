package sports.service;

import java.util.List;

/**
 * Generic service implementation for the sports application
 * 
 * @author Cleo Pinto (@cleopinto)
 *
 * @param <T>
 */
public interface SportsService<T> {

	List<T> findAll();

	T findById(String id);

	T create(T resource);

	T delete(String id);

	T update(T resource);

	T patch(T resource);

}
