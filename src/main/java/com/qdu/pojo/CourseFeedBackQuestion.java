package com.qdu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseFeedBackQuestion {


     private int qid;
     private Course course;
     private String qcontent;
     private List<CourseFeedBack> courseFeedBacks = new ArrayList<>(0);

    public CourseFeedBackQuestion() {
    }

	
    public CourseFeedBackQuestion(int qid, Course course, String qcontent) {
        this.qid = qid;
        this.course = course;
        this.qcontent = qcontent;
    }
    public CourseFeedBackQuestion(int qid, Course course, String qcontent, List<CourseFeedBack> courseFeedBacks) {
       this.qid = qid;
       this.course = course;
       this.qcontent = qcontent;
       this.courseFeedBacks = courseFeedBacks;
    }
   
    public int getQid() {
        return this.qid;
    }
    
    public void setQid(int qid) {
        this.qid = qid;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getQcontent() {
        return this.qcontent;
    }
    
    public void setQcontent(String qcontent) {
        this.qcontent = qcontent;
    }
    public List<CourseFeedBack> getCourseFeedBacks() {
        return this.courseFeedBacks;
    }
    
    public void setCourseFeedBacks(List<CourseFeedBack> courseFeedBacks) {
        this.courseFeedBacks = courseFeedBacks;
    }




}


