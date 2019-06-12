package com.sys.mybatis.entity;

        import lombok.Data;

        import java.io.Serializable;

/**
 * @author ：yangsong
 * @date ：Created in 2019年5月20日 0020 23:48
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
public class User implements Serializable {

    private int id;
    private String username;
    private String address;

}
