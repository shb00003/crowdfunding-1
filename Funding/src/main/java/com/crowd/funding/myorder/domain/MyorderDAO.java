package com.crowd.funding.myorder.domain;

import java.util.List;

import com.crowd.funding.myorder.common.MyorderDTOJoin;

public interface MyorderDAO {
	 public List<MyorderDTOJoin> rewardList(int mem_idx);
	 public List<MyorderDTOJoin> orderList(MyorderDTOJoin myorderJoin);
}
