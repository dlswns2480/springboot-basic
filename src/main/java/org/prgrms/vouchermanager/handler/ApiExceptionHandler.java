package org.prgrms.vouchermanager.handler;

import lombok.extern.slf4j.Slf4j;
import org.prgrms.vouchermanager.common.ApiResponse;
import org.prgrms.vouchermanager.exception.NotExistEmailException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ApiResponse errorHandler(RuntimeException e){
        log.error(e.getMessage());
        return ApiResponse.error(e.getMessage());
    }
}