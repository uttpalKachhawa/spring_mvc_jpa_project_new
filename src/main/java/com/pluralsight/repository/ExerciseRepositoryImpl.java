/**
 * 
 */
package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

/**
 * @author 212574988
 *
 */
@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ExerciseRepository#save(com.pluralsight.model.Exercise)
	 */
	@PersistenceContext
	EntityManager em;
	
	
	public Exercise save(Exercise exercise) {
		// TODO Auto-generated method stub
		em.persist(exercise);
		em.flush();
		
		return exercise;
	}

}
