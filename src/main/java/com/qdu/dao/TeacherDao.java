
package com.qdu.dao;

import com.qdu.pojo.Attendance;
import com.qdu.pojo.Batch;
import com.qdu.pojo.Course;
import com.qdu.pojo.Student;
import com.qdu.pojo.TeachingProgram;
import com.qdu.pojo.TeachingProgramDetail;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {
    
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    public void insert(plan newplan){
       
    }
    
    public void update(plan updatedplan){
        
    }
    public plan getplan(String courseNo){
      
        return null;
    }
    
    public List getplanList(){
       
        return null;
    }
    
    public List getBatchList(){
      
        return null;
    }
    
    public List getCourseList(){
        
        return null;
    }
    
    public List getTPListByBatch(int cid){
        
        return null;
    }
    
     public List getTPListByCourse(String cid){
       
        return null;
    }
     
    
     
      public List getAttendance(){
       
        return null;
        
    }
      
       public List getAbsence(){
       
        return null;
        
    }
      
    public List getAttendanceByStudent(){
        
        return null;
        
    }
    
    public List getTop20(){
    
        return null;
        
    }

    private static class plan {

        public plan() {
        }
    }
}
