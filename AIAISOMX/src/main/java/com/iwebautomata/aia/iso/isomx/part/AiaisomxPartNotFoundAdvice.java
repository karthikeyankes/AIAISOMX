package com.iwebautomata.aia.iso.isomx.part;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class AiaisomxPartNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(AiaisomxPartNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String AiaisomxPartNotFoundHandler(AiaisomxPartNotFoundException ex) {
    return ex.getMessage();
  }
}
