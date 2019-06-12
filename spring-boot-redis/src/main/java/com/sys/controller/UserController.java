package com.sys.controller;

import com.sys.common.utils.ResultUtil;
import com.sys.common.vo.Result;
import com.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月27日 0027 00:34
 * @description：${description}
 * @modified By：
 * @version: $version$
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired private UserService userService;

    @GetMapping("userAll")
    public Result getUserAll(){
        return  ResultUtil.ok(userService.findAll());
    }

    @GetMapping("delete")
    public int deleteById(int id){
        return userService.deleteUser(id);
    }


}
