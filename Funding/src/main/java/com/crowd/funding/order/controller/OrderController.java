package com.crowd.funding.order.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crowd.funding.order.domain.OrderDTO;
import com.crowd.funding.order.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Inject
	OrderService orderService;

	@RequestMapping("/reservation")
	public String orderInsert(Model model, OrderDTO orderDTO) {
		orderService.insert(orderDTO);
		System.out.println(orderDTO.getOrder_address1());
		System.out.println(orderDTO.getOrder_address2());
		System.out.println(orderDTO.getOrder_address3());
		System.out.println(orderDTO.getOrder_address4());
		return "order/reservation";
	}
	

}
