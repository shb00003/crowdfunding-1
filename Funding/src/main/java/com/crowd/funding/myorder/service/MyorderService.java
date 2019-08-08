package com.crowd.funding.myorder.service;

import java.util.List;

import com.crowd.funding.myorder.common.MyorderDTOJoin;
import com.crowd.funding.myorder.domain.MyorderDTO;

public interface MyorderService {
	public List<MyorderDTOJoin> rewardList(int mem_idx);
	public List<MyorderDTOJoin> orderList(MyorderDTOJoin myorderJoin);
}
