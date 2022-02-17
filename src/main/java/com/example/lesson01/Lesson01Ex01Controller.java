package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") //공통주소 매핑
@Controller
public class Lesson01Ex01Controller {
	
	// 요청 url: http://localhost:8080/lesson01/ex01/1
	@ResponseBody //응답값의 몸체, 리턴되는 값을 HTML ResponseBody로 보낸다.
	@RequestMapping("/lesson01/ex01/1") //주소 매핑
	public String ex01_1() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		return text;
	}
	
	// 요청 url: http:localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		// {"키이름":123, "키이름2":"값"}
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 5);
		map.put("banana", 4);
		map.put("peach", 8);
		map.put("grapefruit", 6);
		
		//HttpMessageConverter
		//@Controller = @RequestBody return 타입이 Map이거나 List이거나 객체일 때 json으로 변환된다.
		//web starter에 jackson 이라는 라이브러리가 포함되어있다.
		return map;
	}
}
