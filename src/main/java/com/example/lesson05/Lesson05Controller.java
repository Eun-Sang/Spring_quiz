package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson05Controller {

	@RequestMapping("lesson05/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@RequestMapping("lesson05/ex02")
	public String ex02(Model model) {
		// String 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("체리");
		fruits.add("딸기");
		fruits.add("복숭아");
		fruits.add("키위");
		fruits.add("망고");
		
		model.addAttribute("fruits", fruits);
		
		
		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		
		Map<String, Object> userMap = new HashMap<>();
		userMap.put("name", "tjsdkgus");
		userMap.put("age", 25);
		userMap.put("hobby", "뜨개질");
		users.add(userMap);
		
		userMap = new HashMap<>();
		userMap.put("name", "qkranseo");
		userMap.put("age", 27);
		userMap.put("hobby", "dnpqtjvld");
		users.add(userMap);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
}
