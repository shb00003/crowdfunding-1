package com.crowd.funding.admin.ad_project;

import java.util.List;

import com.crowd.funding.project.model.ProjectDTO;

public interface Ad_ProjectDAO {
	public List<ProjectDTO> projectAll(ProjectDTO dto);
	public int proType(int pro_type_progress);
	

}
