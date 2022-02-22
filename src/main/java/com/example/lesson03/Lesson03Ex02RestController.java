package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;

@RestController
public class Lesson03Ex02RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 요청 url : http://localhost:8080/lesson03/ex02/1
	@RequestMapping("/lesson03/ex02/1")
	public String ex02() {
		Review review = new Review(); // 일반 java bean
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("dmstkd");
		review.setPoint(4.5);
		review.setReview("혼자먹기 적당함");
		
		int rowCount = reviewBO.addReview(review); // insert된 행의 수를 리턴 받는다.
		return "success row count:" + rowcount;
	}
	
	// 요청 url : http://localhost:8080/lesson03/ex02/2
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		int row = reviewBO.addReviewAsfield(11, "콤비네이션R", "dmstkd", 4.0, "맛있어요");
		return "입력 성공: " + row;
	}
	
}
