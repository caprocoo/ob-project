package com.caprocoo.ob.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.PersistenceException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.sql.SQLIntegrityConstraintViolationException;

@Slf4j
@RestControllerAdvice
public class ExceptionController {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> methodValidException(MethodArgumentNotValidException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = validErrorResponse(e.getBindingResult());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorResponse> nullPointException(NullPointerException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.NULL_POINT_EXCEPTION.getCode(), ErrorCode.NULL_POINT_EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> sqlIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.SQLINTEGRITY_CONSTRAINT_VIOLATION_EXCEPTION.getCode(), ErrorCode.SQLINTEGRITY_CONSTRAINT_VIOLATION_EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(PersistenceException.class)
    public ResponseEntity<ErrorResponse> persistenceException(PersistenceException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.PERSISTANCE_EXCEPTION.getCode(), ErrorCode.PERSISTANCE_EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(IOException.class)
    public ResponseEntity<ErrorResponse> ioException(IOException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.IO_EXCEPTION.getCode(), ErrorCode.IO_EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NoSuchFileException.class)
    public ResponseEntity<ErrorResponse> noSuchFileException(NoSuchFileException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.NO_SEARCH_EXCEPTION.getCode(), ErrorCode.NO_SEARCH_EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(DirectoryNotEmptyException.class)
    public ResponseEntity<ErrorResponse> directoryNotEmptyException(DirectoryNotEmptyException e, HttpServletRequest request){

        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}",request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.DIRECTORY_NOT_EMPTY_EXCEPTION.getCode(), ErrorCode.DIRECTORY_NOT_EMPTY_EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }




    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exception(Exception e, HttpServletRequest request){
        log.warn("request.getRequestURI() = {}, e.getStackTrace() = {}", request.getRequestURI(), e.getStackTrace());
        log.info("request = {}", request);

        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.EXCEPTION.getCode(), ErrorCode.EXCEPTION.getDescription(), e.toString());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


    private ErrorResponse validErrorResponse(BindingResult bindingResult){
        String code = "";
        String description = "";
        String detail = "";

        if(bindingResult.hasErrors()){
            // DTO에 설정한 meaasge값을 가져온다
            detail = bindingResult.getFieldError().getDefaultMessage();

            // DTO에 유효성체크를 걸어놓은 어노테이션명을 가져온다.
            String bindResultCode = bindingResult.getFieldError().getCode();

            log.error("methodValidException = {}", bindResultCode);

            switch (bindResultCode){
                case "NotNull":
                    code = ErrorCode.NOT_NULL.getCode();
                    description = ErrorCode.NOT_NULL.getDescription();
                    break;
                case "NotBlank":
                    code = ErrorCode.NOT_BLANK.getCode();
                    description = ErrorCode.NOT_BLANK.getDescription();
                    break;
                case "Min":
                    code = ErrorCode.MIN_VALUE.getCode();
                    description = ErrorCode.MIN_VALUE.getDescription();
                    break;
                case "Size":
                    code = ErrorCode.SIZE.getCode();
                    description = ErrorCode.SIZE.getDescription();
                    break;
                case "Pattern":
                    code = ErrorCode.PATTERN.getCode();
                    description = ErrorCode.PATTERN.getDescription();
                    break;
            }
        }
        return new ErrorResponse(code, description, detail);
    }
}
