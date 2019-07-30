package com.crowd.funding.project.model;

import java.util.List;

public interface ProjectDAO {
	
	public void add(ProjectDTO dto);
	public List<ProjectDTO> pro_list(int pro_idx);
	public void save1(ProjectDTO dto);

}
