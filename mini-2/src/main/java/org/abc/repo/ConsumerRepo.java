package org.abc.repo;

import java.util.List;
import java.util.Set;

import org.abc.Entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConsumerRepo extends JpaRepository<Consumer,Integer> {

	@Query("select c.Name,c.Email,c.Mobile from Consumer c where c.PlanName=:pname and c.PlanStatus=:pstatus")
	List<List<String>> searchedConsumer2Arg(String pname,String pstatus);
	@Query("select c.Name,c.Email,c.Mobile from Consumer c")
	List<List<String>> searchedConsumerNoArg();
	@Query("select c.Name,c.Email,c.Mobile from Consumer c where c.PlanName=:pname")
	List<List<String>> searchedConsumerPlanArg(String pname);
	@Query("select c.Name,c.Email,c.Mobile from Consumer c where c.PlanStatus=:pstatus")
	List<List<String>> searchedConsumerStatusArg(String pstatus);
	@Query("select c.PlanStatus from Consumer c")
	Set<String> getAllStatus();
	
	@Query("select c.PlanName from Consumer c")
	Set<String> getAllPlan();
}
