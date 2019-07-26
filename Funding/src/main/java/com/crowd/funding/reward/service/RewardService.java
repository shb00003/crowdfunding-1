package com.crowd.funding.reward.service;

import java.util.List;

import com.crowd.funding.reward.domain.RewardDTO;

public interface RewardService {
	List<RewardDTO> rewardRead (int pro_id);
	
}
