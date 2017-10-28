package com.qdu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeachingProgramDetail {


     private int tpdid;
     private TeachingProgram teachingProgram;
     private int tpdyear;
     private String tpdseason;
     private String tpdweek;
     private String tpdweekDay;
     private String tpdlessonTime;
     private String tpdlocation;
     private List<Attendance> attendances = new ArrayList<>(0);

    public TeachingProgramDetail() {
    }

	
    public TeachingProgramDetail(int tpdid, TeachingProgram teachingProgram, int tpdyear, String tpdseason, String tpdweek, String tpdweekDay, String tpdlessonTime, String tpdlocation) {
        this.tpdid = tpdid;
        this.teachingProgram = teachingProgram;
        this.tpdyear = tpdyear;
        this.tpdseason = tpdseason;
        this.tpdweek = tpdweek;
        this.tpdweekDay = tpdweekDay;
        this.tpdlessonTime = tpdlessonTime;
        this.tpdlocation = tpdlocation;
    }
    public TeachingProgramDetail(int tpdid, TeachingProgram teachingProgram, int tpdyear, String tpdseason, String tpdweek, String tpdweekDay, String tpdlessonTime, String tpdlocation, List<Attendance> attendances) {
       this.tpdid = tpdid;
       this.teachingProgram = teachingProgram;
       this.tpdyear = tpdyear;
       this.tpdseason = tpdseason;
       this.tpdweek = tpdweek;
       this.tpdweekDay = tpdweekDay;
       this.tpdlessonTime = tpdlessonTime;
       this.tpdlocation = tpdlocation;
       this.attendances = attendances;
    }
   
    public int getTpdid() {
        return this.tpdid;
    }
    
    public void setTpdid(int tpdid) {
        this.tpdid = tpdid;
    }
    public TeachingProgram getTeachingProgram() {
        return this.teachingProgram;
    }
    
    public void setTeachingProgram(TeachingProgram teachingProgram) {
        this.teachingProgram = teachingProgram;
    }
    public int getTpdyear() {
        return this.tpdyear;
    }
    
    public void setTpdyear(int tpdyear) {
        this.tpdyear = tpdyear;
    }
    public String getTpdseason() {
        return this.tpdseason;
    }
    
    public void setTpdseason(String tpdseason) {
        this.tpdseason = tpdseason;
    }
    public String getTpdweek() {
        return this.tpdweek;
    }
    
    public void setTpdweek(String tpdweek) {
        this.tpdweek = tpdweek;
    }
    public String getTpdweekDay() {
        return this.tpdweekDay;
    }
    
    public void setTpdweekDay(String tpdweekDay) {
        this.tpdweekDay = tpdweekDay;
    }
    public String getTpdlessonTime() {
        return this.tpdlessonTime;
    }
    
    public void setTpdlessonTime(String tpdlessonTime) {
        this.tpdlessonTime = tpdlessonTime;
    }
    public String getTpdlocation() {
        return this.tpdlocation;
    }
    
    public void setTpdlocation(String tpdlocation) {
        this.tpdlocation = tpdlocation;
    }
    public List<Attendance> getAttendances() {
        return this.attendances;
    }
    
    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }




}


