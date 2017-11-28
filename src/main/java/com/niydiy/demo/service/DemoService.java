package com.niydiy.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niydiy.entity.Demo;
import com.niydiy.mapper.DemoMapper;

@Service
public class DemoService {
	@Autowired
	private DemoMapper demoMapper;

	public List<Demo> likeName(String name) {
		return demoMapper.likeName(name);
	}
	
	@Transactional
	public int save(Demo demo) {
		demoMapper.save(demo);
		return demo.getId();
	}

	public Demo getById(long id) {
		return demoMapper.getById(id);
	}
}
