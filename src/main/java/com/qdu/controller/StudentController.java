
package com.qdu.controller;

import com.qdu.pojo.Batch;
import com.qdu.pojo.CourseFeedBackQuestion;
import com.qdu.pojo.Student;
import com.qdu.pojo.TeacherFeedBackQuestion;
import com.qdu.service.StudentService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/student")
public class StudentController {
    
    Student student = null;
    
    @Autowired
    private StudentService studentService;
     @RequestMapping(value="/login")
    public String login(){        
        return "login";
    } 
    @RequestMapping(value="/getStu")
    public String GetStu(String studentId,ModelMap map){
    studentService.getStudentList();
     map.addAttribute("stuList",studentService.getStudentList());
    return "Student";
    }
      @RequestMapping(value="/welcome")
    public String welcome(String sId,String sPwd,ModelMap map,HttpSession session){
        student = studentService.findStudent(sId, sPwd);
          System.out.println(student.getStudentName());
        session.setAttribute("student", student);

        map.addAttribute("student", student);
        return "Student"; 
    }  
    @RequestMapping(value="/forregister")
    public String forzhuce(){ 
        return "register"; 
    }
         @RequestMapping(value="/register")
    public String zhuce(String studentId,String studentName,String studentPwd,Integer studentGrade,Integer batch,String studentGender,ModelMap map){ 
//        studentService.addStudent(student);
//             System.out.println(student);
        map.addAttribute("sList", studentService.getStudentList());
        return "login"; 
    } 
    //
     @RequestMapping(value="/foredit")
    public String foredit(String rollno,ModelMap map,HttpSession session){ 
         System.out.println("跳转");
        Student s = student;
        if(s==null){
            System.out.println("空");
        }else{
            System.out.println(s.getStudentName());
        }
        map.addAttribute("student",s); 
        return "Alter"; 
    }
     @RequestMapping(value="/editStu")
    public String edit(HttpServletRequest request,ModelMap map){ 
        String stuId = request.getParameter("studentId");
        String stuName = request.getParameter("studentName");
        String stuPwd = request.getParameter("studentPwd");
        String stuGrade = request.getParameter("studentGrade");
        String batch = request.getParameter("batch");
        String stuGender = request.getParameter("studentGender");
        Batch b = new Batch();
        b.setCid(Integer.parseInt(batch));
        Student stu = new Student(stuId, b, stuName, stuPwd, stuGender, Integer.parseInt(stuGrade));
        map.addAttribute("sList", studentService.updateStudent(stu)); 
        System.out.println("修改成功");
        return "Student";
    } 
    //
        @RequestMapping(value = "/toattendance")
    public String ToAttendance(String studentId,String beginDate,String endDate,ModelMap map){
     return "Attendance";
    }
    @RequestMapping(value = "/attendance")
    public String showAttendance(String id,String beginDate,String endDate,ModelMap map){
        System.out.println("--------------------------");
        System.out.println(id);
        System.out.println(studentService.getAttendanceList(id, beginDate, endDate).size());
     map.addAttribute("attenList",studentService.getAttendanceList(id, beginDate, endDate));
     return "Attendance";
    }
    //
    @RequestMapping(value = "/showcourse")
    public String showCourse(String studentId,ModelMap map){
    map.addAttribute("courList",studentService.getCourseList(studentId));
        System.out.println("00000000000000000"+ studentService.getCourseList(studentId).size());
    return "Courses";
    }
    @RequestMapping(value = "/showcoursedetail")
    public String showCoursedetail(String courseId,ModelMap map){
    map.addAttribute("courdList",studentService.getCourseDetailList(courseId));
    return "CourseDetai";
    }
    //
    @RequestMapping(value = "/forcFeedBack")
    public String ForCFeedBack(String courseId,ModelMap map){
    map.addAttribute("cquestionList",studentService.getCourseFeedBackQuestionList(courseId));
   return "CourseID";
    }
    @RequestMapping(value = "/forccFeedBack")
    public String ForCCFeedBack(String courseId,ModelMap map){
        System.out.println("-----------------"+courseId);    
        
    map.addAttribute("cquestionList",studentService.getCourseFeedBackQuestionList(courseId));
        System.out.println(studentService.getCourseFeedBackQuestionList(courseId).size());
   return "CourseFeedBack";
    }
    @RequestMapping(value = "/addcFeedBack")
    public String addCourseFeedBack(HttpServletRequest req,String studentId,ModelMap map){
        List<CourseFeedBackQuestion> list=studentService.getCourseFeedBackQuestionList(studentId);
        for(int i=0;i<list.size();i++){
            int qid;
            int choice;
            CourseFeedBackQuestion cq=list.get(i); //获取当前问题
            qid=cq.getQid();
            choice=Integer.parseInt(req.getParameter("cq"+qid));//获取用户当前问题的选择
            studentService.insertCourseFeedBack(qid, choice, studentId);
              map.addAttribute("addcfb",studentService.insertTeacherFeedBack(qid, choice, studentId));   
        }
              
         return "CourseID";
    }

    
    @RequestMapping(value = "/fortFeedBack")
    public String ForTFeedBack(String teacherId,ModelMap map){
    map.addAttribute("tquestionList",studentService.getTeacherFeedBackQuestionlist(teacherId));
   return "TeacherID";
    }
        @RequestMapping(value = "/forttFeedBack")
    public String ForTTFeedBack(String teacherId,ModelMap map){
    map.addAttribute("tquestionList",studentService.getTeacherFeedBackQuestionlist(teacherId));
   return "TeacherFeedBack";
    }
        @RequestMapping(value = "/addtFeedBack")
  public String addTeacherFeedBack(HttpServletRequest req,String studentId,ModelMap map){
        List<TeacherFeedBackQuestion> list=studentService.getTeacherFeedBackQuestionlist(studentId);
        for(int i=0;i<list.size();i++){
            int qid;
            int choice;
            TeacherFeedBackQuestion cq=list.get(i); //获取当前问题
            qid=cq.getQid();
            choice=Integer.parseInt(req.getParameter("cq"+qid));
            studentService.insertTeacherFeedBack(qid, choice, studentId);
            map.addAttribute("addcfb",studentService.insertTeacherFeedBack(qid, choice, studentId));  
    }
        return "TeacherID";
}

}