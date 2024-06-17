package com.desjardins.filmotheque.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandlerAdvice {

    @ExceptionHandler(FilmNotFoundException.class)
    ProblemDetail handleNotFoundException(FilmNotFoundException e) {
        ProblemDetail problemDetails = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        problemDetails.setTitle("Film Not Found");
        problemDetails.setProperty("Id", e.getId());
        return problemDetails;
    }
}
