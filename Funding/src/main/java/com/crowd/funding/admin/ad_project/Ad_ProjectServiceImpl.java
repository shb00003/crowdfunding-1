package com.crowd.funding.admin.ad_project;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crowd.funding.project.model.ProjectDTO;

@Service
public class Ad_ProjectServiceImpl implements Ad_ProjectService {
	
	@Inject
	Ad_ProjectDAO ad_ProjectDao;
	
	@Override
	public List<ProjectDTO> projectAll(ProjectDTO dto) {
		return ad_ProjectDao.projectAll(dto);
	}
	
	@Override
	public int proType(int pro_type_progress) {
		return ad_ProjectDao.proType(pro_type_progress);
	}
	

}
