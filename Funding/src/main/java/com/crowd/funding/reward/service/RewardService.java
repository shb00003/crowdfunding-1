package com.crowd.funding.reward.service;

import java.util.List;
import java.util.Map;

import com.crowd.funding.reward.domain.RewardDTO;

public interface RewardService {
	List<RewardDTO> rewardAll (int pro_id);
	List<RewardDTO> rewardSel (int reward_id[]);
}
