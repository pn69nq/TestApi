package com.pq.api.common;

/**
 * <pre>
 *     author : chenzengqiang
 *     e-mail : chenzengqiang@hongdoujiao.com
 *     time   : 2018/7/21
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BaseResult<T> {
    private int code;
    private T result;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", result=" + result +
                ", msg='" + msg + '\'' +
                '}';
    }
}
