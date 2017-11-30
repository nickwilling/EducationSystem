package com.qdu.service;

import com.qdu.dao.TeacherDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;
    
    public List getBatchList(){
        return teacherDao.getBatchList();
    }
    public List getCourseList(){
        return teacherDao.getCourseList();
    }

    public List getTPListByBatch(int cid){
         
         return teacherDao.getTPListByBatch(cid) ;
    }
    
    public List getTPListByCourse(String cid){
         
         return teacherDao.getTPListByCourse(cid) ;
    }
    
    public List getAttendance(){
         
         return teacherDao.getAttendance() ;
    }
    public List getAbsence(){
         
         return teacherDao.getAbsence() ;
    }
    
    public List getAttendanceByStudent(){
         
         return teacherDao.getAttendanceByStudent();
    }
    
    public List getTop20(){
         
         return teacherDao.getTop20();
    }
}
