package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;

@Controller
public class ReviewController {
	
//	レビュー登録画面表示リクエスト
	@GetMapping("/show-review-form")
	public String showReviewForm(@ModelAttribute ReviewRegistForm form) {
		return "regist-review";
	}
	
//	レビュー登録画面リクエスト　戻るボタン押下後
	@PostMapping("/show-review-form-ret")
	public String showReviewFormRet(@ModelAttribute ReviewRegistForm form) {
		return "regist-review";
	}
	
//	レビュー登録リクエスト
	@PostMapping("/regist-review")
	public String registReview(@ModelAttribute ReviewRegistForm form) {
		return "confirm-regist-review";
	}
	
//	レビュー登録登録リクエスト 登録確認画面より
	@PostMapping("/confirm-regist-review")
	public String confirmRegistReview(ReviewRegistForm form, Model model) {
		
		model.addAttribute("msg","レビュー登録完了しました！");
		return "complete-regist-review";
	}

}
