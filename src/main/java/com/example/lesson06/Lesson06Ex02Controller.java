package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lesson06Ex02Controller {

	@RequestMapping("lesson06/ex02/add_user_view")
	public String addUserName() {
		return "/lesson06/add_user";
		
	}
	
	// 중복 확인
	@ResponseBody
	@RequestMapping("lesson06/ex02/is_duplication")
	public Map<String, Boolean> isDuplication(
			@RequestParam("name") String name) {
		
		// TODO DB 조회
		Map<String, Boolean> result = new HashMap<>();
		result.put("is_duplication", true);
		
		return result;
	}
	
	
}
