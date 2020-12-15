package com.study.microsuser;

public enum CodeContant {

    SUCCESS(1, "成功"),
    FAIL(0, "失败"),
    SERVER_ERROR(1001, "服务异常"),
    PARAM_ERROR(2001, "参数异常"),
    Hystrix_MSG(2002, "网络开小差了，请稍后重试！"),
    DATA_NOT_EXIST(2003, "数据不存在");

    private int returnCode;
    private String returnMsg;

    private CodeContant(int returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public int getReturnCode() {
        return this.returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }
}
