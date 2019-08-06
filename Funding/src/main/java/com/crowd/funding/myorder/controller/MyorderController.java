package com.crowd.funding.myorder.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crowd.funding.myorder.service.MyorderService;

@Controller
@RequestMapping("/mypage")
public class MyorderController {

	@Inject
	MyorderService myorderService;
	
	@RequestMapping("/myreward/fundinglist")
	public String myRewardList(Model model, @RequestParam("pro_id") int pro_id) {
		
		return "/myorder/myreward";
	}
	
	@RequestMapping("/myprofile/fundinglist")
	public void myFundingList() {
		
	}
}
