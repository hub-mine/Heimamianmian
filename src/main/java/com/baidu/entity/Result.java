package com.baidu.entity;

public class Result {
    private boolean flag;
    private String message;
    private Object result;

    public Result(boolean flag, String message) {

    }

    public Result() {

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
    public void setResult(Boolean flage ,Result result) {
        this.result = result;
        this.flag = flage;
    }
    public void setResult(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, String message, Object result) {
        this.flag = flag;
        this.message = message;
        this.result = result;
    }
}
