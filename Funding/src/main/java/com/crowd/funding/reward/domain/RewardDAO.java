package com.crowd.funding.reward.domain;

import java.util.List;

public interface RewardDAO {
	List<RewardDTO> rewardRead (int pro_id);
}
