package com.qdu.pojo;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Attendance {


     private int aid;
     private Student student;
     private TeachingProgramDetail teachingProgramDetail;
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     private Date adate;
     private int aweek;
     private int astate;

    public Attendance() {
    }

    public Attendance(int aid, Student student, TeachingProgramDetail teachingProgramDetail, Date adate, int aweek, int astate) {
       this.aid = aid;
       this.student = student;
       this.teachingProgramDetail = teachingProgramDetail;
       this.adate = adate;
       this.aweek = aweek;
       this.astate = astate;
    }
   
    public int getAid() {
        return this.aid;
    }
    
    public void setAid(int aid) {
        this.aid = aid;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public TeachingProgramDetail getTeachingProgramDetail() {
        return this.teachingProgramDetail;
    }
    
    public void setTeachingProgramDetail(TeachingProgramDetail teachingProgramDetail) {
        this.teachingProgramDetail = teachingProgramDetail;
    }
    public Date getAdate() {
        return this.adate;
    }
    
    public void setAdate(Date adate) {
        this.adate = adate;
    }
    public int getAweek() {
        return this.aweek;
    }
    
    public void setAweek(int aweek) {
        this.aweek = aweek;
    }
    public int getAstate() {
        return this.astate;
    }
    
    public void setAstate(int astate) {
        this.astate = astate;
    }




}


