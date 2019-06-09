package com.sys.common.utils;


import com.sys.common.vo.Result;

public class ResultUtil {

    public static Result ok(Object data) {
        Result result = new Result();
        result.setCode(ConstantUtils.OK);
        result.setMessage("ok");
        result.setData(data);
        return result;
    }

    public static Result ok() {
        return ok(null);
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(ConstantUtils.ERROR);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ConstantUtils.ERROR);
        result.setMessage(msg);
        return result;
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

}
