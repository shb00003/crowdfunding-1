package com.crowd.funding.reward.service;

import java.util.List;
import java.util.Map;

import com.crowd.funding.member.model.memberDTO;
import com.crowd.funding.reward.domain.RewardDTO;

public interface RewardService {
	List<RewardDTO> rewardAll (int pro_id) throws Exception;
	List<RewardDTO> rewardSel (int reward_id[]) throws Exception;
	memberDTO personinfo(int mem_idx) throws Exception;
}
