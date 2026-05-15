package com.example.webapp.response;

public class ApiResponse<T> {

    private boolean sucess;
    private T data;
    private String message;

    public ApiResponse() {}

    public ApiResponse(boolean sucess, T data, String message) {
        this.sucess = sucess;
        this.data = data;
        this.message = message;
    }


    //getter and setter
    public boolean isSucess() {
        return sucess;
    }

    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
