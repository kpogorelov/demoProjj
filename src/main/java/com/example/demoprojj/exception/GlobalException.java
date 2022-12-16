package com.example.demoprojj.exception;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.net.URI;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorObject> handleResourcesNotFoundException(ResourceNotFoundException ex) {
            ErrorObject error = new ErrorObject();
            error.setHttpStatus(HttpStatus.NOT_FOUND);
            error.setTimestamp(ZonedDateTime.now(ZoneId.of("Z")));
            error.setMessage(ex.getMessage());
            return new ResponseEntity<ErrorObject>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorObject> handleNoDataFoundException(NoDataFoundException ex){
        ErrorObject error = new ErrorObject();
        error.setHttpStatus(HttpStatus.NO_CONTENT);
        error.setTimestamp(ZonedDateTime.now(ZoneId.of("Z")));
        error.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorObject>(error, HttpStatus.OK);
    }

}
