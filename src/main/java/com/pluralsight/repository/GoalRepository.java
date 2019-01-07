/**
 * 
 */
package com.pluralsight.repository;



import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

/**
 * @author 212574988
 *
 */

public interface GoalRepository {

	Goal save(Goal goal);
	
	List<Goal> loadAll();
	List<GoalReport> findAllGoalReports();
}
