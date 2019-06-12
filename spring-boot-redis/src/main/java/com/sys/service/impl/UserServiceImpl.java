package com.sys.service.impl;

import com.sys.mybatis.entity.User;
import com.sys.mybatis.mapper.UserMapper;
import com.sys.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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

    /**
     *  @Cacheable 注解中的key属性值 需要被英文双引号引用，否则系统执行缓存操作异常。
     */
    @Cacheable(value = "UserCache",key = "'user.findAll'")
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @CacheEvict(value = "UserCache",key = "'user.findAll'")
    @Override
    public int deleteUser(int id) {
        return userMapper.delete(id);
    }
}
