package com.niydiy.demo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.niydiy.demo.bean.Cat;
import com.niydiy.demo.dao.CatDao;
import com.niydiy.demo.repository.CatRepository;

@Service
public class CatService {
	@Resource
	private CatRepository catRepository;

	@Resource
	private CatDao catDao;

	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}

	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}

	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}

	public Cat findByCatName(String catName) {
		return catRepository.findByCatName(catName);
	}

	public Cat selectByCatName(String catName) {
		return catDao.selectByCatName(catName);
	}
}
