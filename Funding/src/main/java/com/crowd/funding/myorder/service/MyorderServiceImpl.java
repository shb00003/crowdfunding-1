package com.crowd.funding.myorder.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crowd.funding.myorder.common.MyorderDTOJoin;
import com.crowd.funding.myorder.domain.MyorderDAO;
import com.crowd.funding.myorder.domain.MyorderDTO;

@Service
public class MyorderServiceImpl implements MyorderService {

	@Inject
	MyorderDAO myorderDAO;

	@Override
	public List<MyorderDTOJoin> rewardList(int mem_idx) {
		return myorderDAO.rewardList(mem_idx);
	}

	@Override
	public List<MyorderDTOJoin> orderList(MyorderDTOJoin myorderJoin) {
		return  myorderDAO.orderList(myorderJoin);
	}
	
	

}
