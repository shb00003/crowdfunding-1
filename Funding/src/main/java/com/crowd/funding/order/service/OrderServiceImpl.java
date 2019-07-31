package com.crowd.funding.order.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crowd.funding.order.domain.OrderDAO;
import com.crowd.funding.order.domain.OrderDTO;

@Service
public class OrderServiceImpl implements OrderService {

	@Inject
	OrderDAO orderDAO;

	@Override
	public void insert(OrderDTO orderDTO) {
		orderDAO.insert(orderDTO);
	}
}
