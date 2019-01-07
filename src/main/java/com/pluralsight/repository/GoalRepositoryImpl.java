/**
 * 
 */
package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

/**
 * @author 212574988
 *
 */
@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.GoalRepository#saveGoal(com.pluralsight.model.Goal)
	 */
	
	@PersistenceContext
	private EntityManager em;
	
	
	public Goal save(Goal goal) {
		// TODO Auto-generated method stub
		
		if(goal.getId()==null){
		
			//return void always
			em.persist(goal);
			em.flush();	
		}
		else
		{
			//return updated object
			em.merge(goal);	
		}
		
		return goal;
	}


	public List<Goal> loadAll() {
		// TODO Auto-generated method stub
		//Query query=em.createQuery("Select g from Goal g");
		
		TypedQuery<Goal> query=em.createNamedQuery(Goal.FIND_ALL_GOALS,Goal.class);
		
	//	@SuppressWarnings("unchecked")
		List<Goal> goals=query.getResultList();
		
		return goals;
	}


	
	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		/*Query query=em.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity)" +
		"from Goal g, Exercise e where g.id= e.goal.id");
		*/
		TypedQuery<GoalReport> query=em.createNamedQuery(Goal.FIND_GOAL_REPORTS,GoalReport.class);
		return query.getResultList();
	}
	
	

}
