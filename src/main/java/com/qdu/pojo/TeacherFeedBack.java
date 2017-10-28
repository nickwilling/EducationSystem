package com.qdu.pojo;




public class TeacherFeedBack  {


     private int fid;
     private Student student;
     private TeacherFeedBackQuestion teacherFeedBackQuestion;
     private Integer foption;

    public TeacherFeedBack() {
    }

	
    public TeacherFeedBack(int fid, Student student, TeacherFeedBackQuestion teacherFeedBackQuestion) {
        this.fid = fid;
        this.student = student;
        this.teacherFeedBackQuestion = teacherFeedBackQuestion;
    }
    public TeacherFeedBack(int fid, Student student, TeacherFeedBackQuestion teacherFeedBackQuestion, Integer foption) {
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
    public Integer getFoption() {
        return this.foption;
    }
    
    public void setFoption(Integer foption) {
        this.foption = foption;
    }




}


