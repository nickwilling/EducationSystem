package com.qdu.pojo;


public class CourseDetail{


     private String cdetailId;
     private Course course;
     private String cdetailCotent;
     private int cdetailSchoolHour;

    public CourseDetail() {
    }

    public CourseDetail(String cdetailId, Course course, String cdetailCotent, int cdetailSchoolHour) {
       this.cdetailId = cdetailId;
       this.course = course;
       this.cdetailCotent = cdetailCotent;
       this.cdetailSchoolHour = cdetailSchoolHour;
    }
   
    public String getCdetailId() {
        return this.cdetailId;
    }
    
    public void setCdetailId(String cdetailId) {
        this.cdetailId = cdetailId;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getCdetailCotent() {
        return this.cdetailCotent;
    }
    
    public void setCdetailCotent(String cdetailCotent) {
        this.cdetailCotent = cdetailCotent;
    }
    public int getCdetailSchoolHour() {
        return this.cdetailSchoolHour;
    }
    
    public void setCdetailSchoolHour(int cdetailSchoolHour) {
        this.cdetailSchoolHour = cdetailSchoolHour;
    }




}


