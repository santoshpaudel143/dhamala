package com.example.dhamal.globalexception;

import com.example.dhamal.pojo.ApiResponse;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ApiResponse handleUniqueViolation(ConstraintViolationException ex){
        if(ex.getConstraintName().contains("unique")){
            ApiResponse apiResponse = new ApiResponse();
            // unique_user_name
            String unique = ex.getConstraintName().replace("unique_", "");
            return apiResponse.error(unique + " already exists", null);
        }
        return null;
    }

    @ExceptionHandler(Exception.class)
    public ApiResponse handleAllException(Exception ex){
        ApiResponse apiResponse = new ApiResponse();
        return apiResponse.error(ex.getLocalizedMessage(), null);

    }
}
