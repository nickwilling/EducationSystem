package com.qdu.dao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.qdu.pojo.Batch;
import com.qdu.pojo.Course;
import com.qdu.pojo.Student;
import com.qdu.pojo.Teacher;

@Repository
public class TestDao{

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	
	public Course selectCourseById(String courseId) {
		String statement = "com.qdu.mapping.CourseMapping.selectCourseById";
		return sqlSessionFactory.openSession().selectOne(statement, courseId);
	}
	
	public Student selectStudentById(String studentId) {
		String statement = "com.qdu.mapping.StudentMapping.selectStudentById";
		return sqlSessionFactory.openSession().selectOne(statement, studentId);
	}
	
	public Teacher selectTeacherById(String teacherId) {
		String statement = "com.qdu.mapping.TeacherMapping.selectTeacherById";
		return sqlSessionFactory.openSession().selectOne(statement, teacherId);
	}
	
	public Batch selectBatchById(int cid) {
		String statement = "com.qdu.mapping.BatchMapping.selectBatchById";
		return sqlSessionFactory.openSession().selectOne(statement, cid);
	}
}
