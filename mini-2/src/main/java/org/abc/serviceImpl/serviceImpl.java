package org.abc.serviceImpl;

import java.util.List;
import java.util.Set;

import org.abc.Entity.SearchRequest;
import org.abc.Iservice.IService;
import org.abc.repo.ConsumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements IService {

	@Autowired
	private ConsumerRepo repo;
	@Override
	public Set<String> allStatus() {	
		return repo.getAllStatus();
	}
	public Set<String> allPlan() {	
		return repo.getAllPlan();
	}
    public List<List<String>> searchConsumer(SearchRequest sr){
    	if(sr.getPlanName()!=null && sr.getPlanStatus()!=null)
		return repo.searchedConsumer2Arg(sr.getPlanName(),sr.getPlanStatus());
    	if(sr.getPlanName()!=null)
    	return repo.searchedConsumerPlanArg(sr.getPlanName());
    	if(sr.getPlanStatus()!=null)
        return repo.searchedConsumerStatusArg(sr.getPlanStatus());
    	return repo.searchedConsumerNoArg();
	}
}
