package com.niydiy.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.niydiy.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer> {
	public Cat findByCatName(String catName);
}
