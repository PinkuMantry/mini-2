package org.abc.Iservice;

import java.util.List;
import java.util.Set;

import org.abc.Entity.SearchRequest;

public interface IService {

	public Set<String> allStatus();
	public Set<String> allPlan();
	public List<List<String>> searchConsumer(SearchRequest sr);
}
