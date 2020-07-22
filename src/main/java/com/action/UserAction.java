package com.action;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService service;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("查询全部的springmvc");
        List<User> all = service.findAll();
        model.addAttribute("list",all);
        return "list";
    }
    @RequestMapping("/save")
    public String save(User user){
        service.save(user);
        return "forward:/index.jsp";}
}
