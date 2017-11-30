package com.qdu.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;


public class TeacherFeedBackQuestion {


     private int qid;
     private Teacher teacher;
     private String qcontent;
     private List<TeacherFeedBack> teacherFeedBacks = new ArrayList<>(0);

    public TeacherFeedBackQuestion() {
    }

	
    public TeacherFeedBackQuestion(int qid, Teacher teacher, String qcontent) {
        this.qid = qid;
        this.teacher = teacher;
        this.qcontent = qcontent;
    }
    public TeacherFeedBackQuestion(int qid, Teacher teacher, String qcontent, List<TeacherFeedBack> teacherFeedBacks) {
       this.qid = qid;
       this.teacher = teacher;
       this.qcontent = qcontent;
       this.teacherFeedBacks = teacherFeedBacks;
    }
   
    public int getQid() {
        return this.qid;
    }
    
    public void setQid(int qid) {
        this.qid = qid;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String getQcontent() {
        return this.qcontent;
    }
    
    public void setQcontent(String qcontent) {
        this.qcontent = qcontent;
    }
    public List<TeacherFeedBack> getTeacherFeedBacks() {
        return this.teacherFeedBacks;
    }
    
    public void setTeacherFeedBacks(List<TeacherFeedBack> teacherFeedBacks) {
        this.teacherFeedBacks = teacherFeedBacks;
    }




}


