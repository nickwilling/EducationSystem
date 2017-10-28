package com.qdu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qdu.dao.TestDao;
import com.qdu.pojo.Course;

@Transactional
@Service
public class TestService{

	@Autowired
	private TestDao testDao;
	
	public Course selectCourseById(String courseId) {
		return testDao.selectCourseById(courseId);
	}



}
