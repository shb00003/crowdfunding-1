package com.crowd.funding.myorder.domain;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.crowd.funding.myorder.common.MyorderDTOJoin;

@Repository
public class MyorderDAOImpl implements MyorderDAO {

	private static final String NAMESPACE = "com.crowd.funding.mapper.myorderMapper";
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MyorderDTOJoin> rewardList(int mem_idx) {
		return sqlSession.selectList(NAMESPACE+".my_reward_list", mem_idx);
	}

	@Override
	public List<MyorderDTOJoin> orderList(MyorderDTOJoin myorderJoin) {
		return sqlSession.selectList(NAMESPACE+".order_info", myorderJoin);
	}
	
	
}
