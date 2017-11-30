package com.qdu.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class CourseFeedBack {


     private int fid;
     private CourseFeedBackQuestion courseFeedBackQuestion;
     private Student student;
     private int foption;

    public CourseFeedBack() {
    }

	
    public CourseFeedBack(int fid, CourseFeedBackQuestion courseFeedBackQuestion, Student student) {
        this.fid = fid;
        this.courseFeedBackQuestion = courseFeedBackQuestion;
        this.student = student;
    }
    public CourseFeedBack(int fid, CourseFeedBackQuestion courseFeedBackQuestion, Student student, int foption) {
       this.fid = fid;
       this.courseFeedBackQuestion = courseFeedBackQuestion;
       this.student = student;
       this.foption = foption;
    }
   
    public int getFid() {
        return this.fid;
    }
    
    public void setFid(int fid) {
        this.fid = fid;
    }
    
    public CourseFeedBackQuestion getCourseFeedBackQuestion() {
        return this.courseFeedBackQuestion;
    }
   
    public void setCourseFeedBackQuestion(CourseFeedBackQuestion courseFeedBackQuestion) {
        this.courseFeedBackQuestion = courseFeedBackQuestion;
    }
   
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public int getFoption() {
        return this.foption;
    }
    
    public void setFoption(int foption) {
        this.foption = foption;
    }




}


