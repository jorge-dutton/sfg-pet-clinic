package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Common interface similar to CrudRepository
 * 
 * @author jorge.dutton
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudService<T, ID> {
	Set<T> findAll();
	T findById(ID id);
	T save(T object);
	void delete(T object);
	void deleteById(ID id);

}