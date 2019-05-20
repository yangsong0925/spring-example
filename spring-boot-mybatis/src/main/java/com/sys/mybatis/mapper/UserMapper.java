package com.sys.mybatis.mapper;

import com.sys.mybatis.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

}
