package com.example.demo.app.blog.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.app.blog.test.mapper.EmpMapper;
import com.example.demo.app.blog.test.service.EmpService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service 
public class EmpServiceImpl implements EmpService{
	
	private final EmpMapper empMapper;
	
	@Override
	public List<Map<String, Object>> getEmp() {
		return empMapper.selectEmp();
	}
	
	@Override
	@Cacheable(value="findEmpCache")
	public List<Map<String, Object>> getEmpForCache() {
		slowQuery(2000);
		return empMapper.selectEmp();
	}
	
	@Override
	public List<Map<String, Object>> getEmpForNoCache() {
		slowQuery(2000);
		return empMapper.selectEmp();
	}
	
	@Override
	@CacheEvict(value="findEmpCache")
	public void clearEmpCache() {
		log.info("Cache Clear!");
	}
	
    private void slowQuery(long seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
