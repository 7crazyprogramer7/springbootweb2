package cn.cq.springboot.controller;

import cn.cq.springboot.pojo.User;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.POST,consumes = "application/json")
    public String hello(@RequestBody User user) {
        System.out.println(new Gson().toJson(user));
        return new Gson().toJson(user);
    }
//    @PostMapping(value = "/Login")
//    public String login(String username,String pwd){
//
//        //使用重定向定位资源
//        return "redirect:page/main.html";
//    }
}
