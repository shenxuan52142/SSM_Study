package com.sx.controller;

import com.alibaba.fastjson.JSONObject;
import com.sx.pojo.StudentS;
import com.sx.service.StudentSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class StudentSJsonController {

    @Autowired
    StudentSService studentSService;

    @ResponseBody
    @RequestMapping("/submitStudentS")
    public String submitStudentS(@RequestBody StudentS studentS) {
        System.out.println("SSM接受到浏览器提交的json,并转换为StudentS对象：" + studentS);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/getOneStudentS")
    public String getOneStudentS() {
        StudentS c = studentSService.get(2);
        c.getId();
        c.getName();
        c.getAge();
        JSONObject json = new JSONObject();
        json.put("studentS", JSONObject.toJSON(c));
        return json.toJSONString();
    }

    @ResponseBody
    @RequestMapping("/getManyStudentS")
    public String getManyStudentS() {
        List<StudentS> cs = new ArrayList<StudentS>();
        for (int i = 0; i < 10; i++) {
            StudentS c = studentSService.get(i);
            cs.add(c);

        }
        return JSONObject.toJSON(cs).toString();
    }


}
