package com.crowd.funding.reward.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crowd.funding.reward.service.RewardService;

@Controller
@RequestMapping("/reward")
public class RewardController {

	@Inject
	RewardService rewardService;
	
	@RequestMapping("/step10")
	public String read(Model model, int pro_id) {
		
		model.addAttribute("rewards", rewardService.rewardRead(pro_id));
		return "/order/show_reward";
	}
}
