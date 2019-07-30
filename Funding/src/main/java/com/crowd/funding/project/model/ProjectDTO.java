package com.crowd.funding.project.model;

import java.util.Date;

public class ProjectDTO {
	
	private int pro_idx;
	private String pro_name;
	private int pro_type1;
	private int pro_status;
	private String pro_summary;
	private String pro_content;
	private int pro_price;
	private String pro_image;
	private Date pro_datetime;
	private Date pro_updated_datetime;
	private int pro_sell_days;
	private int mem_idx;
	private Date expect_ship_date;
	private Date delivery_date;
	private Date delayed_date;
	private int pro_type_progress;
	private int pro_category;
	private String pro_keyword1;
	private String pro_keyword2;
	private String pro_keyword3;
	private Date pro_start;
	private Date pro_end;
	private String pro_policy;
	
	
	@Override
	public String toString() {
		return "ProjectDTO [pro_idx=" + pro_idx + ", pro_name=" + pro_name + ", pro_type1=" + pro_type1 + ", pro_status="
				+ pro_status + ", pro_summary=" + pro_summary + ", pro_content=" + pro_content + ", pro_price="
				+ pro_price + ", pro_image=" + pro_image + ", pro_datetime=" + pro_datetime + ", pro_updated_datetime="
				+ pro_updated_datetime + ", pro_sell_days=" + pro_sell_days + ", mem_idx=" + mem_idx
				+ ", expect_ship_date=" + expect_ship_date + ", delivery_date=" + delivery_date + ", delayed_date="
				+ delayed_date + ", pro_type_progress=" + pro_type_progress + ", pro_category=" + pro_category
				+ ", pro_keyword1=" + pro_keyword1 + ", pro_keyword2=" + pro_keyword2 + ", pro_keyword3=" + pro_keyword3
				+ ", pro_start=" + pro_start + ", pro_end=" + pro_end + ", pro_policy=" + pro_policy + "]";
	}


	public int getPro_idx() {
		return pro_idx;
	}


	public String getPro_name() {
		return pro_name;
	}


	public int getPro_type1() {
		return pro_type1;
	}


	public int getPro_status() {
		return pro_status;
	}


	public String getPro_summary() {
		return pro_summary;
	}


	public String getPro_content() {
		return pro_content;
	}


	public int getPro_price() {
		return pro_price;
	}


	public String getPro_image() {
		return pro_image;
	}


	public Date getPro_datetime() {
		return pro_datetime;
	}


	public Date getPro_updated_datetime() {
		return pro_updated_datetime;
	}


	public int getPro_sell_days() {
		return pro_sell_days;
	}


	public int getMem_idx() {
		return mem_idx;
	}


	public Date getExpect_ship_date() {
		return expect_ship_date;
	}


	public Date getDelivery_date() {
		return delivery_date;
	}


	public Date getDelayed_date() {
		return delayed_date;
	}


	public int getPro_type_progress() {
		return pro_type_progress;
	}


	public int getPro_category() {
		return pro_category;
	}


	public String getPro_keyword1() {
		return pro_keyword1;
	}


	public String getPro_keyword2() {
		return pro_keyword2;
	}


	public String getPro_keyword3() {
		return pro_keyword3;
	}


	public Date getPro_start() {
		return pro_start;
	}


	public Date getPro_end() {
		return pro_end;
	}


	public String getPro_policy() {
		return pro_policy;
	}


	public void setPro_idx(int pro_idx) {
		this.pro_idx = pro_idx;
	}


	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}


	public void setPro_type1(int pro_type1) {
		this.pro_type1 = pro_type1;
	}


	public void setPro_status(int pro_status) {
		this.pro_status = pro_status;
	}


	public void setPro_summary(String pro_summary) {
		this.pro_summary = pro_summary;
	}


	public void setPro_content(String pro_content) {
		this.pro_content = pro_content;
	}


	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}


	public void setPro_image(String pro_image) {
		this.pro_image = pro_image;
	}


	public void setPro_datetime(Date pro_datetime) {
		this.pro_datetime = pro_datetime;
	}


	public void setPro_updated_datetime(Date pro_updated_datetime) {
		this.pro_updated_datetime = pro_updated_datetime;
	}


	public void setPro_sell_days(int pro_sell_days) {
		this.pro_sell_days = pro_sell_days;
	}


	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}


	public void setExpect_ship_date(Date expect_ship_date) {
		this.expect_ship_date = expect_ship_date;
	}


	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}


	public void setDelayed_date(Date delayed_date) {
		this.delayed_date = delayed_date;
	}


	public void setPro_type_progress(int pro_type_progress) {
		this.pro_type_progress = pro_type_progress;
	}


	public void setPro_category(int pro_category) {
		this.pro_category = pro_category;
	}


	public void setPro_keyword1(String pro_keyword1) {
		this.pro_keyword1 = pro_keyword1;
	}


	public void setPro_keyword2(String pro_keyword2) {
		this.pro_keyword2 = pro_keyword2;
	}


	public void setPro_keyword3(String pro_keyword3) {
		this.pro_keyword3 = pro_keyword3;
	}


	public void setPro_start(Date pro_start) {
		this.pro_start = pro_start;
	}


	public void setPro_end(Date pro_end) {
		this.pro_end = pro_end;
	}


	public void setPro_policy(String pro_policy) {
		this.pro_policy = pro_policy;
	}
	

}
