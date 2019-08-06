package com.crowd.funding.order.domain;

public class OrderDTO {
	int order_id; // reward_order_T 의 PrimaryKey
	int mem_idx; // member_T의 primary Key
	String mem_email; 
	String order_name;
	String mem_phone;
	int total_money; // 최종 금액 이나 필요 없을 수 있다.getTotalMoney 함수로 대체 가능함.
	String order_requests;
	int order_status;
	String order_address1;
	String order_address2;
	String order_address3;
	String order_address4;
	String order_address_all;
	
	public String getOrder_address_all() {
		return order_address_all;
	}
	public void setOrder_address_all(String order_address_all) {
		this.order_address_all = order_address_all;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getMem_idx() {
		return mem_idx;
	}
	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public int getTotal_money() {
		return total_money;
	}
	public void setTotal_money(int total_money) {
		this.total_money = total_money;
	}
	public String getOrder_requests() {
		return order_requests;
	}
	public void setOrder_requests(String order_requests) {
		this.order_requests = order_requests;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public String getOrder_address1() {
		return order_address1;
	}
	public void setOrder_address1(String order_address1) {
		this.order_address1 = order_address1;
	}
	public String getOrder_address2() {
		return order_address2;
	}
	public void setOrder_address2(String order_address2) {
		this.order_address2 = order_address2;
	}
	public String getOrder_address3() {
		return order_address3;
	}
	public void setOrder_address3(String order_address3) {
		this.order_address3 = order_address3;
	}
	public String getOrder_address4() {
		return order_address4;
	}
	public void setOrder_address4(String order_address4) {
		this.order_address4 = order_address4;
	}
	
}
