package com.qdu.controller;

import com.qdu.pojo.Course;
import com.qdu.pojo.TeachingProgramDetail;
import com.qdu.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/showIndex.do")
    public String showIndex(String courseId,ModelMap map) {
    	System.out.println(courseId); 
    	Course course = testService.selectCourseById(courseId);
    	System.out.println(course.getCourseName());
    	map.put("course",course);
        return "admin";
    }

    
}

