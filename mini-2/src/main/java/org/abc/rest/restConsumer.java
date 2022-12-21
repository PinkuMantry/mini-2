package org.abc.rest;

import java.util.List;
import java.util.Set;

import org.abc.Entity.SearchRequest;
import org.abc.Iservice.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restConsumer {
	@Autowired
	private IService service;
	@GetMapping("/allPlanStatus")
	public Set<String> Status()
	{
		return service.allStatus();
	}
	@GetMapping("/allPlanName")
	public Set<String> Plan()
	{
		return service.allPlan();
	}
	@GetMapping("/csearch")
	public List<List<String>> csearch(@RequestBody SearchRequest sr)
	{
		return service.searchConsumer(sr);
	}
	

}
