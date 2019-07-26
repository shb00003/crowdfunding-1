package com.crowd.funding.reward.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crowd.funding.reward.domain.RewardDAO;
import com.crowd.funding.reward.domain.RewardDTO;

@Service
public class RewardServiceImpl implements RewardService {

	@Inject
	RewardDAO rewardDAO;
	
	// 생성자에서 Inject 하는 것과 변수로 Inject 하는 차이점이 무엇일까.

	@Override
	public List<RewardDTO> rewardRead(int pro_id) {
		return rewardDAO.rewardRead(pro_id);
	}

}
