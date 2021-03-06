package com.sys.service.impl;

import com.sys.mybatis.entity.User;
import com.sys.mybatis.mapper.UserMapper;
import com.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月21日 0021 00:10
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.delete(id);
    }
}
