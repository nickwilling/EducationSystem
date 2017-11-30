package com.qdu.dao;

import com.qdu.pojo.Course;
import com.qdu.pojo.CourseDetail;
import com.qdu.pojo.CourseFeedBack;
import com.qdu.pojo.CourseFeedBackQuestion;
import com.qdu.pojo.Student;
import com.qdu.pojo.TeacherFeedBack;
import com.qdu.pojo.TeacherFeedBackQuestion;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired

    private SqlSessionFactory sqlSessionFactory;
    public Student findStudent(String sid, String spwd) {
      
        return null;
    }
    public Student findStudentByRollno(String sid) {
      
        return null;
    }
    public Student addStudent(Student student) {
      
        return null;

    }



    public Student updateStudent(Student s) {
      
        return null;

    }

    public List getCourseList(String studentId) {
        
        return null;
    }
    public List getCourseDetailList(String courseId) {
        
        return null;
    }

    public List getAttendanceList(String studentId, String beginDate, String endDate) {
        
        return null;
    }

    public List getCourseFeedBackQuestionList(String courseId) {
       
        return null;
    }
    public List getTeacherFeedBackQuestionList(String teacherId) {
       
        return null;
    }
    public void insertCFeedBack(int qid,int choice,String studentId) {
        
    }

    public List getTeacherFeedBackList() {
       
        return null;
    }

    public void insertTFeedBack(int qid,int choice,String studentId) {
      
    }
}
