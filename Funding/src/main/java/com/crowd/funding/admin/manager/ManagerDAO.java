package com.crowd.funding.admin.manager;

import java.util.List;

public interface ManagerDAO {
	List<ManagerDTO> listManager();
	void insertManager(ManagerDTO dto);
	void updateManager(String admin_id);
	void deleteManager(ManagerDTO dto);

}
