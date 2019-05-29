package com.sys.controller;

import com.sys.mybatis.entity.User;
import com.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月27日 0027 00:34
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Controller("/user")
public class UserController {

    @Autowired private UserService userService;

    @GetMapping("/userAll")
    @ResponseBody
    public List<User> getUserAll(){
        return userService.findAll();
    }

    @GetMapping("delete")
    public int deleteById(int id){
        return userService.deleteUser(id);
    }


}
