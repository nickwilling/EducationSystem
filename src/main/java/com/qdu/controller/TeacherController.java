package com.qdu.controller;


import com.qdu.service.TeacherService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    
    @RequestMapping(value = "/showIndex")
    public String showIndex(){
        return "select";
    }
    
    @RequestMapping(value = "/updateContent")
    public String updateContent(){
        return "management";
    }
            
    @RequestMapping(value = "/checkBatch")
    public String checkBatch(ModelMap map){
        map.addAttribute("batchList", teacherService.getBatchList());
        return "batch";
    }
    
    @RequestMapping(value = "/showTPByBatch")
    public String showTeachingProgramOfBatch(int cid,ModelMap map){
        map.addAttribute("TPList", teacherService.getTPListByBatch(cid));
        return "result";
    }
    
    @RequestMapping(value = "/checkCourse")
    public String checkCourse(ModelMap map){
        map.addAttribute("courseList", teacherService.getCourseList());
        return "course";
    }
    
    @RequestMapping(value = "/showTPByCourse")
    public String showTeachingProgramByCourse(String cid,ModelMap map){
        map.addAttribute("TPList", teacherService.getTPListByCourse(cid));
        return "courseTP";
    }

    @RequestMapping(value = "/manageAttendance")
    public String manageAttendance(){
        return "manageAttendance";
    }
    @RequestMapping(value = "/showAttendace")
    public String showAttendance(ModelMap map){
        List list=teacherService.getAttendance();
        Object[] objects=(Object[])list.get(0);
//        System.out.println("--------------"+((Student)objects[1]).getStudentName());
        map.addAttribute("aList",list );
        return "manageAttendance";
    }
    
    @RequestMapping(value = "/showAbsence")
    public String showAbsence(ModelMap map){
        List list=teacherService.getAbsence();
        System.out.println("aaaaaaaaaa"+list.size());
        map.addAttribute("aList",list );
        return "manageAttendance";
    }
    
    @RequestMapping(value = "/manageAttendanceByStudent")
    public String manageAttendanceByStudent(){
        return "manageAttendanceByStudent";
    }
    
    @RequestMapping(value = "/showAttendaceByStudent")
    public String showAttendanceByStudent(ModelMap map){
        List list=teacherService.getAttendanceByStudent();
        Object[] objects=(Object[])list.get(0);
//        System.out.println("--------------"+((Student)objects[1]).getStudentName());
        map.addAttribute("aList",list );
        return "manageAttendanceByStudent";
    }
    
    @RequestMapping(value = "/showTop20")
    public String showTop(ModelMap map){
        List list=teacherService.getTop20();
        map.addAttribute("top20",list );
        return "top20";
    }
    
}
