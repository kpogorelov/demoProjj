package com.example.demoprojj.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ErrorObject {
    private  String message;
    private  HttpStatus httpStatus;
    private  ZonedDateTime timestamp;


    public ErrorObject(String message,
                       HttpStatus httpStatus,
                       ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public ErrorObject() {
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
