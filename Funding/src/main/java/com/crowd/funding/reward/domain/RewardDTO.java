package com.crowd.funding.reward.domain;

public class RewardDTO {
	 int reward_id; //order_reward_T의 키 값
 	 int pro_id; // project_T의 키 값
	 int mem_id; // member_T의 키값
	 String reward_title;
	 int reward_price;
	 int reward_sell_count;
	 
	 public int getReward_id() {
		return reward_id;
	}
	public void setReward_id(int reward_id) {
		this.reward_id = reward_id;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public String getReward_title() {
		return reward_title;
	}
	public void setReward_title(String reward_title) {
		this.reward_title = reward_title;
	}
	public int getReward_price() {
		return reward_price;
	}
	public void setReward_price(int reward_price) {
		this.reward_price = reward_price;
	}
	public int getReward_sell_count() {
		return reward_sell_count;
	}
	public void setReward_sell_count(int reward_sell_count) {
		this.reward_sell_count = reward_sell_count;
	}
	
}
