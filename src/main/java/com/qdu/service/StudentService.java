package com.qdu.service;

import com.qdu.dao.StudentDao;
import com.qdu.pojo.Course;
import com.qdu.pojo.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student getStudent(String rollno) {
        return studentDao.findStudentByRollno(rollno);
    }

    public Student findStudent(String sid, String spwd) {
        return studentDao.findStudent(sid, spwd);
    }

    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public List<Student> getStudentList() {
        System.out.println("注册");
        return null;
    }

    public Student updateStudent(Student student) {
        System.out.println(student.getStudentId()+"ID");
        Student s = studentDao.findStudentByRollno(student.getStudentId());
        s = student;
        System.out.println(s+"------");
        
        System.out.println(student);
        return studentDao.updateStudent(s);
    }

    public List getCourseList(String studentId) {
        return studentDao.getCourseList(studentId);
    }

    public List getCourseDetailList(String courseId) {
        return studentDao.getCourseDetailList(courseId);
    }

    public List getAttendanceList(String studentId, String beginDate, String endDate) {
        return studentDao.getAttendanceList(studentId, beginDate, endDate);
    }

    public List getCourseFeedBackQuestionList(String courseId) {
        return studentDao.getCourseFeedBackQuestionList(courseId);
    }

    public List getTeacherFeedBackQuestionlist(String teacherId) {
        return studentDao.getTeacherFeedBackQuestionList(teacherId);
    }

    public boolean insertCourseFeedBack(int qid, int choice, String studentId) {
        try {
            studentDao.insertCFeedBack(qid, choice, studentId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertTeacherFeedBack(int qid, int choice, String studentId) {
        try {
            studentDao.insertTFeedBack(qid, choice, studentId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
