package com.crowd.funding.reward.domain;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class RewardDAOImpl implements RewardDAO {

	private static final String NAMESPACE = "com.crowd.funding.mapper.rewardMapper";
	
	private final SqlSession sqlSession;
	
	@Inject
	public RewardDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<RewardDTO> rewardRead(int pro_id) {
		return sqlSession.selectList(NAMESPACE+".reward_read",pro_id);
	}

}
