package com.sys.mybatis.mapper;

import com.sys.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月20日 0020 23:51
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Mapper
public interface UserMapper {

    @Select("select * from tb_user")
    List<User> findAll();

    @Delete("delete from tb_user where id = #{id}")
    int delete(@Param("id") Integer id);


    @Insert(" insert into tb_user (username,address) values " +
            " <foreach item='value' index='key' collection='users' separator=','> " +
            " (#{username},#{address}) " +
            " </foreach> ")
    int saveUsers(List<User> users);

}
