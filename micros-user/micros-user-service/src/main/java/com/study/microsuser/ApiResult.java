package com.study.microsuser;

/**
 * <p>Description  ApiResult</p>
 *
 * @author tianshenglong
 * @date 2020/12/7 17:01
 * @return
 */
public class ApiResult<T> {
    private int returnCode = 1;
    private int returnStatus = 1;
    private String returnMsg = "success";
    private T returnDataList;

    public ApiResult() {
        this.returnStatus = CodeContant.SUCCESS.getReturnCode();
    }

    public ApiResult(int returnCode, String returnMsg) {
        this.updateReturnStatus(returnCode);
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ApiResult(int returnStatus, int returnCode, String returnMsg) {
        this.returnStatus = returnStatus;
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ApiResult(int returnCode, String returnMsg, T returnDataList) {
        this.updateReturnStatus(returnCode);
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
        this.returnDataList = returnDataList;
    }

    public ApiResult(int returnStatus, int returnCode, String returnMsg, T returnDataList) {
        this.returnStatus = returnStatus;
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
        this.returnDataList = returnDataList;
    }

    public ApiResult(T returnDataList) {
        this.returnStatus = CodeContant.SUCCESS.getReturnCode();
        this.returnDataList = returnDataList;
    }

    private void updateReturnStatus(int returnCode) {
        if (CodeContant.SUCCESS.getReturnCode() == returnCode) {
            this.returnStatus = 1;
        } else {
            this.returnStatus = 0;
        }

    }

    public void setReturnCode(final int returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnStatus(final int returnStatus) {
        this.returnStatus = returnStatus;
    }

    public void setReturnMsg(final String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public void setReturnDataList(final T returnDataList) {
        this.returnDataList = returnDataList;
    }

    public int getReturnCode() {
        return this.returnCode;
    }

    public int getReturnStatus() {
        return this.returnStatus;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public T getReturnDataList() {
        return this.returnDataList;
    }


}
