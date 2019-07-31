package com.crowd.funding.order.domain;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO {

	private static final String NAMESPACE = "com.crowd.funding.mapper.orderMapper";
		
	private final SqlSession sqlSession;
		
	@Inject
	public OrderDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void insert(OrderDTO orderDTO) {
		sqlSession.selectList(NAMESPACE + ".order_insert",orderDTO);
	}

	
	
}
