package com.base.ssm.controller;

import com.base.ssm.common.PageReturn;
import com.base.ssm.common.Paginator;
import com.base.ssm.model.SsmUser;
import com.base.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {
    private Logger log =Logger.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/findByUserId")
    public Object findByUserId(HttpServletRequest request,Integer userId){
        SsmUser user=userService.findByUserId(1);
        return user;
    }
    @ResponseBody
    @RequestMapping("/findByUser")
    public Object findByUser(HttpServletRequest request){
        SsmUser user=userService.findByUser(1);
        return user;
    }
    @ResponseBody
    @RequestMapping(value = "/findByName")
    public Object findByName(HttpServletRequest request, SsmUser u,String abc){
        String contentType=request.getContentType();
        String name2=request.getParameter("name");
        SsmUser user=userService.findByUser(1);
        return user;
    }
    @ResponseBody
    @RequestMapping("/log4j")
    public Object log4j(Integer userId){
        log.debug("---->>>>>>>>>log4j debug:"+userId);
        log.info("---->>>>>>>>>log4j info:"+userId);
        log.warn("---->>>>>>>>>log4j warn:"+userId);
        log.error("---->>>>>>>>log4j error:"+userId);

        SsmUser user=userService.findByUser(userId);
        return user;
    }
    @ResponseBody
    @RequestMapping("/userList2")
    public Object userList2(Paginator p){
        return userService.userList(p);
    }
    @ResponseBody
    @RequestMapping("/oneUser")
    public Object oneUser(Integer userId){
        SsmUser user=userService.selectByKey(userId);
        return PageReturn.successData(user);
    }

}
