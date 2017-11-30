package com.qdu.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class TeacherFeedBack  {


     private int fid;
     private Student student;
     private TeacherFeedBackQuestion teacherFeedBackQuestion;
     private int foption;

    public TeacherFeedBack() {
    }

	
    public TeacherFeedBack(int fid, Student student, TeacherFeedBackQuestion teacherFeedBackQuestion) {
        this.fid = fid;
        this.student = student;
        this.teacherFeedBackQuestion = teacherFeedBackQuestion;
    }
    public TeacherFeedBack(int fid, Student student, TeacherFeedBackQuestion teacherFeedBackQuestion, int foption) {
       this.fid = fid;
       this.student = student;
       this.teacherFeedBackQuestion = teacherFeedBackQuestion;
       this.foption = foption;
    }
   
    public int getFid() {
        return this.fid;
    }
    
    public void setFid(int fid) {
        this.fid = fid;
    }
    
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    public TeacherFeedBackQuestion getTeacherFeedBackQuestion() {
        return this.teacherFeedBackQuestion;
    }
  
    public void setTeacherFeedBackQuestion(TeacherFeedBackQuestion teacherFeedBackQuestion) {
        this.teacherFeedBackQuestion = teacherFeedBackQuestion;
    }
    public int getFoption() {
        return this.foption;
    }
    
    public void setFoption(int foption) {
        this.foption = foption;
    }




}


