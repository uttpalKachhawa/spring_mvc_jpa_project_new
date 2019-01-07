/**
 * 
 */
package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;

/**
 * @author 212574988
 *
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

	/* (non-Javadoc)
	 * @see com.pluralsight.service.GoalService#saveGoal(com.pluralsight.model.Goal)
	 */
	
	@Autowired
	private GoalRepository goalRepository;
	

	@Transactional
	public Goal saveGoal(Goal goal) {
		// TODO Auto-generated method stub
		return goalRepository.save(goal);
	}


	public List<Goal> findAllGoals() {
		// TODO Auto-generated method stub
		
		return goalRepository.loadAll();
	}


	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		
		return goalRepository.findAllGoalReports();
	}

}
