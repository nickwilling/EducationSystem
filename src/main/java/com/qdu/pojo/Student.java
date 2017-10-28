package com.qdu.pojo;


import java.util.ArrayList;
import java.util.List;

public class Student {


     private String studentId;
     private Batch batch;
     private String studentName;
     private String studentPwd;
     private String studentGender;
     private int studentGrade;
     private List<CourseFeedBack> courseFeedBacks = new ArrayList<>(0);
     private List<Attendance> attendances = new ArrayList<>(0);
     private List<TeacherFeedBack> teacherFeedBacks = new ArrayList<>(0);

    public Student() {
    }

	
    public Student(String studentId, Batch batch, String studentName, String studentPwd, String studentGender, int studentGrade) {
        this.studentId = studentId;
        this.batch = batch;
        this.studentName = studentName;
        this.studentPwd = studentPwd;
        this.studentGender = studentGender;
        this.studentGrade = studentGrade;
    }
    public Student(String studentId, Batch batch, String studentName, String studentPwd, String studentGender, int studentGrade, List<CourseFeedBack> courseFeedBacks, List<Attendance> attendances, List<TeacherFeedBack> teacherFeedBacks) {
       this.studentId = studentId;
       this.batch = batch;
       this.studentName = studentName;
       this.studentPwd = studentPwd;
       this.studentGender = studentGender;
       this.studentGrade = studentGrade;
       this.courseFeedBacks = courseFeedBacks;
       this.attendances = attendances;
       this.teacherFeedBacks = teacherFeedBacks;
    }
   
    public String getStudentId() {
        return this.studentId;
    }
    
    public void ListStudentId(String studentId) {
        this.studentId = studentId;
    }
    public Batch getBatch() {
        return this.batch;
    }
    
    public void ListBatch(Batch batch) {
        this.batch = batch;
    }
    public String getStudentName() {
        return this.studentName;
    }
    
    public void ListStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentPwd() {
        return this.studentPwd;
    }
    
    public void ListStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }
    public String getStudentGender() {
        return this.studentGender;
    }
    
    public void ListStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }
    public int getStudentGrade() {
        return this.studentGrade;
    }
    
    public void ListStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    public List<CourseFeedBack> getCourseFeedBacks() {
        return this.courseFeedBacks;
    }
    
    public void ListCourseFeedBacks(List<CourseFeedBack> courseFeedBacks) {
        this.courseFeedBacks = courseFeedBacks;
    }
    public List<Attendance> getAttendances() {
        return this.attendances;
    }
    
    public void ListAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }
    public List<TeacherFeedBack> getTeacherFeedBacks() {
        return this.teacherFeedBacks;
    }
    
    public void ListTeacherFeedBacks(List<TeacherFeedBack> teacherFeedBacks) {
        this.teacherFeedBacks = teacherFeedBacks;
    }




}


