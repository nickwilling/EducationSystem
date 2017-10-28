package com.qdu.pojo;

import java.util.ArrayList;
import java.util.List;

public class Course {

     private String courseId;
     private Teacher teacher;
     private String courseName;
     private String courseExamMethod;
     private String coursecredit;
     private int courseSchoolHour;
     private List<CourseDetail> courseDetails = new ArrayList<>(0);
     private List<CourseFeedBack> courseFeedBacks = new ArrayList<>(0);
     private List<TeachingProgram> teachingPrograms = new ArrayList<>(0);

    public Course() {
    }

	
    public Course(String courseId, Teacher teacher, String courseName, String courseExamMethod, String coursecredit, int courseSchoolHour) {
        this.courseId = courseId;
        this.teacher = teacher;
        this.courseName = courseName;
        this.courseExamMethod = courseExamMethod;
        this.coursecredit = coursecredit;
        this.courseSchoolHour = courseSchoolHour;
    }
    public Course(String courseId, Teacher teacher, String courseName, String courseExamMethod, String coursecredit, int courseSchoolHour, List<CourseDetail> courseDetails, List<CourseFeedBack> courseFeedBacks, List<TeachingProgram> teachingPrograms) {
       this.courseId = courseId;
       this.teacher = teacher;
       this.courseName = courseName;
       this.courseExamMethod = courseExamMethod;
       this.coursecredit = coursecredit;
       this.courseSchoolHour = courseSchoolHour;
       this.courseDetails = courseDetails;
       this.courseFeedBacks = courseFeedBacks;
       this.teachingPrograms = teachingPrograms;
    }
   
    public String getCourseId() {
        return this.courseId;
    }
    
    public void ListCourseId(String courseId) {
        this.courseId = courseId;
    }
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void ListTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String getCourseName() {
        return this.courseName;
    }
    
    public void ListCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseExamMethod() {
        return this.courseExamMethod;
    }
    
    public void ListCourseExamMethod(String courseExamMethod) {
        this.courseExamMethod = courseExamMethod;
    }
    public String getCoursecredit() {
        return this.coursecredit;
    }
    
    public void ListCoursecredit(String coursecredit) {
        this.coursecredit = coursecredit;
    }
    public int getCourseSchoolHour() {
        return this.courseSchoolHour;
    }
    
    public void ListCourseSchoolHour(int courseSchoolHour) {
        this.courseSchoolHour = courseSchoolHour;
    }
    public List<CourseDetail> getCourseDetails() {
        return this.courseDetails;
    }
    
    public void ListCourseDetails(List<CourseDetail> courseDetails) {
        this.courseDetails = courseDetails;
    }
    public List<CourseFeedBack> getCourseFeedBacks() {
        return this.courseFeedBacks;
    }
    
    public void ListCourseFeedBacks(List<CourseFeedBack> courseFeedBacks) {
        this.courseFeedBacks = courseFeedBacks;
    }
    public List<TeachingProgram> getTeachingPrograms() {
        return this.teachingPrograms;
    }
    
    public void ListTeachingPrograms(List<TeachingProgram> teachingPrograms) {
        this.teachingPrograms = teachingPrograms;
    }




}


