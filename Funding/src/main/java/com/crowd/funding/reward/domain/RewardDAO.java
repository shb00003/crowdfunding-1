package com.crowd.funding.reward.domain;

import java.util.List;
import java.util.Map;

public interface RewardDAO {
	List<RewardDTO> rewardAll (int pro_id);
	List<RewardDTO> rewardSel (int reward_id[]);
}
