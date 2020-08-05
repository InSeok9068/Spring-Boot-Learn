package com.example.demo.app.blog.test.service;

import java.util.List;
import java.util.Map;

public interface EmpService {
	List<Map<String, Object>> getEmp();
	
	List<Map<String, Object>> getEmpForCache();
	
	List<Map<String, Object>> getEmpForNoCache();
	
	void clearEmpCache();
}
