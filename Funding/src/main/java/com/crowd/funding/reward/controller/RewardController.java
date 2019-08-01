package com.crowd.funding.reward.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crowd.funding.order.service.OrderService;
import com.crowd.funding.reward.common.FirstDATA;
import com.crowd.funding.reward.domain.RewardDTO;
import com.crowd.funding.reward.service.RewardService;

@Controller
@RequestMapping("/reward")
public class RewardController {

	@Inject
	RewardService rewardService;
	@Inject
	OrderService orderService;
	
	@RequestMapping("/step10")
	public String firstRead(Model model, int pro_id) {
		
		model.addAttribute("rewards", rewardService.rewardAll(pro_id));
		
		// 보류 여러개 insert 하는거 먼저하고 할까 ?
		//model.addAttribute("orderCount", orderService.orderCount(pro_id));
		return "/reward/first_reward";
	}
	
	@RequestMapping("/step20")
	public  String secondRead(Model model, @ModelAttribute("firstDATA") FirstDATA firstDATA) {
	
		model.addAttribute("rewardSel",firstDATA);
		//model.addAttribute("rewardSel", rewardService.rewardSel(reward_id));		
		return "/reward/second_reward";
	}
}
