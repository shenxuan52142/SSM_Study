package com.sx.controller;

import com.sx.pojo.StudentS;
import com.sx.service.StudentSService;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentSController {
    @Autowired
    StudentSService studentSService;

    @RequestMapping("/123")
    public String s(Model model) {

        return "a";
    }

    @RequestMapping(value = "/studentS", method = RequestMethod.GET)
    public ModelAndView listStudentS() {
        System.out.println("1111111111111111");
        ModelAndView mav = new ModelAndView();
        List<StudentS> cs = studentSService.list();
           for (StudentS studentS:cs){
               String var1=studentS.getName();
//               var1= StringEscapeUtils.unescapeHtml(var1);
               studentS.setName(var1);
    }

    // 放入转发参数
        mav.addObject("cs", cs);
    // 放入jsp路径
        mav.setViewName("listStudentS");
        return mav;
}


    @RequestMapping(value = "/studentS", method = RequestMethod.PUT)
    public ModelAndView addStudentS(StudentS studentS) {
        System.out.println(studentS.getName());
        String var2=studentS.getName();
//        var2= HtmlUtils.htmlEscape(var2);
        var2=StringEscapeUtils.escapeHtml(var2);
        studentS.setName(var2);
        studentSService.add(studentS);
        ModelAndView mav = new ModelAndView("redirect:/studentS");
        return mav;
    }

    @RequestMapping(value = "/StudentS/{id}", method = RequestMethod.GET)
    public ModelAndView deleteStudentS(StudentS studentS) {
        studentSService.delete(studentS);
        ModelAndView mav = new ModelAndView("redirect:/studentS");
        return mav;
    }

    @RequestMapping(value = "/studentS/{id}", method = RequestMethod.POST)
    public ModelAndView updateStudentS(StudentS studentS) {
        studentSService.update(studentS);
        ModelAndView mav = new ModelAndView("redirect:/studentS");
        return mav;
    }

    @RequestMapping(value = "/studentS/{id}", method = RequestMethod.GET)
    public ModelAndView editStudentS(StudentS studentS) {

        StudentS c = studentSService.get(studentS.getId());

        if (null == c) {
            ModelAndView mav = new ModelAndView("good");
            mav.addObject("message", "用户不存在");
            return mav;
        }


        ModelAndView mav = new ModelAndView("editStudentS");

        mav.addObject("c", c);
        return mav;
    }


}




