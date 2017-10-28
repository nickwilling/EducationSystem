package com.qdu.dao;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qdu.pojo.Course;

@Repository
public class TestDao{

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	
	public Course selectCourseById(String courseId) {
//		String courseId="C00000000001";
		String statement = "com.qdu.mapping.CourseMapping.selectCourseById";
		SqlSession session=sqlSessionFactory.openSession();
		return session.selectOne(statement, courseId);
	}
	
}
