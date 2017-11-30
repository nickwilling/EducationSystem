package com.qdu.pojo;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class TeachingProgram  {


     private int tid;
     private Batch batch;
     private Course course;
     private Teacher teacher;
     private List<TeachingProgramDetail> teachingProgramDetails = new ArrayList<>(0);

    public TeachingProgram() {
    }

	
    public TeachingProgram(int tid, Batch batch, Course course, Teacher teacher) {
        this.tid = tid;
        this.batch = batch;
        this.course = course;
        this.teacher = teacher;
    }
    public TeachingProgram(int tid, Batch batch, Course course, Teacher teacher, List<TeachingProgramDetail> teachingProgramDetails) {
       this.tid = tid;
       this.batch = batch;
       this.course = course;
       this.teacher = teacher;
       this.teachingProgramDetails = teachingProgramDetails;
    }
   
    public int getTid() {
        return this.tid;
    }
    
    public void ListTid(int tid) {
        this.tid = tid;
    }
    
    public Batch getBatch() {
        return this.batch;
    }
   
    public void setBatch(Batch batch) {
        this.batch = batch;
    }
    
    
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
  
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public List<TeachingProgramDetail> getTeachingProgramDetails() {
        return this.teachingProgramDetails;
    }
    
    public void setTeachingProgramDetails(List<TeachingProgramDetail> teachingProgramDetails) {
        this.teachingProgramDetails = teachingProgramDetails;
    }




}


