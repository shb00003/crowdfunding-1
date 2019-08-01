package com.crowd.funding.admin.manager;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.crowd.funding.admin.manager.ManagerDTO;

public interface ManagerDAO {
	
	@Select("select * from admin order by admin_id desc")
	public List<ManagerDTO> listManager();
	
	@Insert("insert into admin valuse"
			+"(#{admin_id}, #{admin_pw}, #{admin_name}, #{admin_email}, #{admin_type})")
	public void insertManager (ManagerDTO dto);
	
	@Select("select * from admin where admin_id=#{admin_id}")
	public ManagerDTO viewManager(@Param("admin_id") String admin_id);
	
	@Update("update admin set admin_pw=#{admin_pw}, adming_email=#{admin_email}"
			      +"admin_type=#{admin_type} where admin_id=#{admin_id}")
	public void updateManager(ManagerDTO dto);
	
	@Delete("delete from admin where admin_id=#{admin_id")
	public void deleteManager(@Param("admin_id") String admin_id);
}
