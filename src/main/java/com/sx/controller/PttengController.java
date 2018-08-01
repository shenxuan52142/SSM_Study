package com.sx.controller;

import com.sx.pojo.student;
import com.sx.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("ptttengController")
public class PttengController {
    @Autowired
    studentService studentService;

    @RequestMapping(value = "/ptteng", method = RequestMethod.GET)
    public String count(Model model) {
        List<student> cs = studentService.list();
        int a = studentService.count();
        int b = studentService.javacount();
        model.addAttribute("cs", cs);
        model.addAttribute("xueyuanrenshu", a);
        model.addAttribute("javaxuexirenshu", b);
        return "T10";
    }


}
