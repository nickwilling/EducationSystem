package com.qdu.dao;

import com.qdu.pojo.Attendance;
import com.qdu.pojo.Batch;
import com.qdu.pojo.Course;
import com.qdu.pojo.CourseFeedBack;
import com.qdu.pojo.Student;
import com.qdu.pojo.TeacherFeedBack;
import com.qdu.pojo.TeachingProgram;
import com.qdu.pojo.TeachingProgramDetail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public List<TeachingProgramDetail> selectTPBySeason(int year, String season) {
    	String statement = "com.qdu.mapping.TeachingProgramDetailMapping.getListByYS";
        Map<String,Object> map = new HashMap<>();
        map.put("year", year);
        map.put("season",season);
        return sqlSessionFactory.openSession().selectList(statement, map);
    }

    public List<TeachingProgramDetail> selectTPByDay(String day) {
    	String statement = "com.qdu.mapping.TeachingProgramDetailMapping.getListByDay";
        return sqlSessionFactory.openSession().selectList(statement, day);
    }

    public List<TeachingProgramDetail> selectTPByTeacher(String teacherId) {
    	String statement = "com.qdu.mapping.TeachingProgramDetailMapping.getListByTeacher";
        return sqlSessionFactory.openSession().selectList(statement, teacherId);
    }

    public List<TeachingProgramDetail> selectTPByLocation(String location) {
    	String statement = "com.qdu.mapping.TeachingProgramDetailMapping.getListByLocation";
        return sqlSessionFactory.openSession().selectList(statement, location);
    }

    public TeachingProgramDetail selectTP(int id) {
    	String statement = "com.qdu.mapping.TeachingProgramDetailMapping.selectTeachingProgramDetailById";
        return sqlSessionFactory.openSession().selectOne(statement, id);
    }

    public void addTP(TeachingProgramDetail tpd) {
    	String statement = "com.qdu.mapping.TeachingProgramDetailMapping.insertTPD";
		sqlSessionFactory.openSession().insert(statement, tpd);
    }
    
    public void addTP2(TeachingProgram tp) {
    	String statement1 = "com.qdu.mapping.TeachingProgramMapping.insertTP";
    	sqlSessionFactory.openSession().insert(statement1, tp);
//		sqlSessionFactory.openSession().insert(statement2, tpd);
    }
    
    public TeachingProgram selectTPByBTC(String teacherId,String courseId,int batchId) {
    	String statement = "com.qdu.mapping.TeachingProgramMapping.getListByBTC";
    	Map<String,Object> map=new HashMap<>();
    	map.put("teacherId", teacherId);
    	map.put("courseId", courseId);
    	map.put("batchId", batchId);
        return sqlSessionFactory.openSession().selectOne(statement, map);
    	
    }

    public void editTP(TeachingProgramDetail tpd) {
    	String statement1 = "com.qdu.mapping.TeachingProgramMapping.updateTP";
    	String statement2 = "com.qdu.mapping.TeachingProgramDetailMapping.updateTPD";
    	SqlSession session=sqlSessionFactory.openSession();
		session.update(statement1, tpd.getTeachingProgram());
		session.update(statement2, tpd);
		session.close();
    }

    public void deleteTP(int id) {
    	String statement1 = "com.qdu.mapping.TeachingProgramDetailMapping.deleteTP";
    	String statement2 = "com.qdu.mapping.AttendanceMapping.deleteAttendance";
    	SqlSession session=sqlSessionFactory.openSession();
		session.delete(statement2, id);
		session.delete(statement1, id);
		session.close();
    }

    public Student selectStudent(String studentId) {
    	String statement = "com.qdu.mapping.StudentMapping.selectStudentById";
        return sqlSessionFactory.openSession().selectOne(statement, studentId);
    }

    public void addStudent(String studentID, String studentName, String gender, int ruxue, int batch) {
       
    }
    
    public void editStudent(Student stu) {
    	 String statement = "com.qdu.mapping.StudentMapping.updateStudent";
         sqlSessionFactory.openSession().update(statement, stu);
    }

    public void deleteStudent(String sid) {
       
    }

    public List selectCFD(int batch) {
       
        return null;
    }

    public void deleteCFD(int sid) {
       
    }

    public List selectTFD(String teacherId) {
       
        return null;
    }

    public void deleteTFD(int sid) {
      
    }

}
