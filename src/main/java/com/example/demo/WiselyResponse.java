package com.example.demo;

/**
 * Created by xiaoai on 2018/4/4.
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
