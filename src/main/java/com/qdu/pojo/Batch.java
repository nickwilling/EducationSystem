package com.qdu.pojo;
import java.util.ArrayList;
import java.util.List;


public class Batch {
	
     private int cid;
     private int cyear;
     private String cname;
     private List<TeachingProgram> teachingPrograms = new ArrayList<>(0);
     private List<Student> students = new ArrayList<>(0);

    public Batch() {
    }

	
    public Batch(int cid, int cyear, String cname) {
        this.cid = cid;
        this.cyear = cyear;
        this.cname = cname;
    }
    public Batch(int cid, int cyear, String cname, List<TeachingProgram> teachingPrograms, List<Student> students) {
       this.cid = cid;
       this.cyear = cyear;
       this.cname = cname;
       this.teachingPrograms = teachingPrograms;
       this.students = students;
    }
   
    public int getCid() {
        return this.cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    public int getCyear() {
        return this.cyear;
    }
    
    public void setCyear(int cyear) {
        this.cyear = cyear;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public List<TeachingProgram> getTeachingPrograms() {
        return this.teachingPrograms;
    }
    
    public void setTeachingPrograms(List<TeachingProgram> teachingPrograms) {
        this.teachingPrograms = teachingPrograms;
    }
    public List<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }




}


