package com.upgrad.mba.aspects;

import com.upgrad.mba.exceptions.LanguageDetailsNotFoundException;
import com.upgrad.mba.responses.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LanguageExceptionAspect {
    @ExceptionHandler(LanguageDetailsNotFoundException.class)
    public ResponseEntity<CustomResponse> handleLanguageDetailsNotFoundException(Exception e){
        CustomResponse response = new CustomResponse(e.getMessage(), HttpStatus.NOT_FOUND.value());
        return  new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
