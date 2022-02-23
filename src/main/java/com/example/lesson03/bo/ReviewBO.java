package com.example.lesson03.bo;

import org.springframework.stereotype.Service;

@Service
public class ReviewBO {

	@Autowired
	
	public int addReview(Review review) {
		return reviewDAO.insertReview(review);
	}

	public int addReviewAsfield(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.addReviewAsfield(storeId, menu, userName, point, review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewDAO.updateReviewById(id, review);
	}
}
