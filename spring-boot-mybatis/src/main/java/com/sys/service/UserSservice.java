package com.sys.service;

import com.sys.mybatis.entity.User;

import java.util.List;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月21日 0021 00:09
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface UserSservice {

    /**
     * 查询所有用户
     */
    List<User> findAll();

    /**
     * 删除用户
     * @return
     */
    int deleteUser(int id);

}
