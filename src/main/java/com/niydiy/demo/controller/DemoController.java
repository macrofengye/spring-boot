package com.niydiy.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.niydiy.demo.service.DemoService;
import com.niydiy.entity.Demo;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;

	@RequestMapping("/list")
	public List<Demo> likeName(String name) {
		PageHelper.startPage(1, 1);
		return demoService.likeName(name);
	}

	@RequestMapping("/getById")
	public Demo likeName(long id) {
		return demoService.getById(id);
	}

	@RequestMapping("/save")
	public int save(String name) {
		Demo demo = new Demo();
		demo.setName(name);
		System.out.println(demo);
		return demoService.save(demo);
	}
}
