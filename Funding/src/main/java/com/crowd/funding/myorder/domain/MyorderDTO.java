package com.crowd.funding.myorder.domain;

public class MyorderDTO {
	int myinfo;  // myoder_T primary key
	 int mem_idx; // member_T primary key
	 int pro_id; // project_T primary key
	 int reward_id; // reward_item_T primary key
	 int order_count; // 리워드 구매 갯수
	 public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}
	int order_id; // reward_order_T primary key
	
	 public int getMyinfo() {
		return myinfo;
	}
	public void setMyinfo(int myinfo) {
		this.myinfo = myinfo;
	}
	public int getMem_idx() {
		return mem_idx;
	}
	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getReward_id() {
		return reward_id;
	}
	public void setReward_id(int reward_id) {
		this.reward_id = reward_id;
	}

	public int getOrder_count() {
		return order_count;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
}
