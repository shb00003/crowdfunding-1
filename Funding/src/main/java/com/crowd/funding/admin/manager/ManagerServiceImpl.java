package com.crowd.funding.admin.manager;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crowd.funding.admin.manager.ManagerDTO;
import com.crowd.funding.admin.manager.ManagerDAO;

@Service

public class ManagerServiceImpl implements ManagerService {
	
	@Inject
	ManagerDAO managerDao;

	@Override
	public List<ManagerDTO> listManager() {
		return managerDao.listManager();
	}

	@Override
	public void insertManager(ManagerDTO dto) {
		managerDao.insertManager(dto);
	}

	@Override
	public void updateManager(ManagerDTO dto) {
		managerDao.updateManager(dto);
	}

	@Override
	public void deleteManager(String admin_id) {
		managerDao.deleteManager(admin_id);

	}

	@Override
	public ManagerDTO viewManager(String admin_id) {
		return managerDao.viewManager(admin_id);
	}

}
