package com.qdu.pojo;

import java.util.ArrayList;
import java.util.List;

public class Teacher{


     private String teacherId;
     private String teacherName;
     private String teacherPwd;
     private String teacherGender;
     private List<TeacherFeedBack> teacherFeedBacks = new ArrayList<>(0);
     private List<Course> courses = new ArrayList<>(0);
     private List<TeachingProgram> teachingPrograms = new ArrayList<>(0);

    public Teacher() {
    }

	
    public Teacher(String teacherId, String teacherName, String teacherPwd, String teacherGender) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherPwd = teacherPwd;
        this.teacherGender = teacherGender;
    }
    public Teacher(String teacherId, String teacherName, String teacherPwd, String teacherGender, List<TeacherFeedBack> teacherFeedBacks, List<Course> courses, List<TeachingProgram> teachingPrograms) {
       this.teacherId = teacherId;
       this.teacherName = teacherName;
       this.teacherPwd = teacherPwd;
       this.teacherGender = teacherGender;
       this.teacherFeedBacks = teacherFeedBacks;
       this.courses = courses;
       this.teachingPrograms = teachingPrograms;
    }
   
    public String getTeacherId() {
        return this.teacherId;
    }
    
    public void ListTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public String getTeacherName() {
        return this.teacherName;
    }
    
    public void ListTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherPwd() {
        return this.teacherPwd;
    }
    
    public void ListTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }
    public String getTeacherGender() {
        return this.teacherGender;
    }
    
    public void ListTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }
    public List<TeacherFeedBack> getTeacherFeedBacks() {
        return this.teacherFeedBacks;
    }
    
    public void ListTeacherFeedBacks(List<TeacherFeedBack> teacherFeedBacks) {
        this.teacherFeedBacks = teacherFeedBacks;
    }
    public List<Course> getCourses() {
        return this.courses;
    }
    
    public void ListCourses(List<Course> courses) {
        this.courses = courses;
    }
    public List<TeachingProgram> getTeachingPrograms() {
        return this.teachingPrograms;
    }
    
    public void ListTeachingPrograms(List<TeachingProgram> teachingPrograms) {
        this.teachingPrograms = teachingPrograms;
    }




}


