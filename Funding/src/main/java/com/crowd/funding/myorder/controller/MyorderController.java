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
	
	@RequestMapping("/myorder/fundinglist")
	// mem_idx 받아야함.
	public String myRewardList(Model model, @RequestParam("pro_id") int pro_id) {
		model.addAttribute("rewardList", myorderService.rewardList(2));
		return "/myorder/myreward";
	}
	@RequestMapping("/myorder/orderlist")
	public String myOrderList(Model model) {
		return "/myorder/orderlist";
	}
	
	/*
	 * @RequestMapping("/myreward/fundinglist") // mem_idx 받아야함. public String
	 * payment(Model model, @RequestParam("pro_id") int pro_id) {
	 * model.addAttribute("rewardList", myorderService.rewardList(pro_id)); return
	 * "/myorder/myreward"; }
	 */
	
	@RequestMapping("/myprofile/fundinglist")
	public void myFundingList() {
		
	}
}
