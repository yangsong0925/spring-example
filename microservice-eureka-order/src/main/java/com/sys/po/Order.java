package com.sys.po;

import lombok.Data;

/**
 * @author ：yangsong
 * @date ：Created in 2019年7月1日 0001 00:41
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
public class Order {

    private String id;
    private Double price;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;

}
