package com.niydiy;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	@RequestMapping("/index")
	public String hello01(Map<String, Object> map) {
		map.put("name", "Tommy");
		return "hello01";
	}
}
