package com.sys.common.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> {

    private String code;
    private String message;
    private long   total;
    private T data;


}
