package com.crowd.funding.project.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
	
	SqlSession sqlSession;

	@Override
	public void add(ProjectDTO dto) {
		sqlSession.insert("project.add", dto);
	}

	@Override
	public List<ProjectDTO> pro_list(int pro_id) {
		return sqlSession.selectList("project.pro_name", pro_id);
	}

	@Override
	public void save1(ProjectDTO dto) {
		sqlSession.insert("project.save1", dto);

		sqlSession.update("project.save1", dto);
	}


}