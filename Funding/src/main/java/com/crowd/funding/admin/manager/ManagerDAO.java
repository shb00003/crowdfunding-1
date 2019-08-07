package com.crowd.funding.admin.manager;

import java.util.List;

public interface ManagerDAO {
<<<<<<< HEAD

		public List<ManagerDTO> listManager();
		public void insertManager(ManagerDTO dto);
		public void updateManager(ManagerDTO dto);
		public void deleteManager(String admin_id);
		public ManagerDTO viewManager(String admin_id);
		
=======
	List<ManagerDTO> listManager();
	void insertManager(ManagerDTO dto);
	void updateManager(String admin_id);
	void deleteManager(ManagerDTO dto);

>>>>>>> refs/remotes/origin/master
}
