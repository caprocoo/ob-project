package com.caprocoo.ob.exception;

import lombok.Getter;


public enum ErrorCode {

    EXCEPTION("001", "서버 사이드 에러발생."),

    NOT_NULL("101","필수값이 누락되었습니다"),
    NOT_BLANK("102", "필수값이 누락되었습니다."),
    MIN_VALUE("103", "최소값보다 커야 합니다."),
    SIZE("104", "문자열의 길이가 범위에서 벗어납니다."),
    PATTERN("105", "형식에 맞지 않습니다."),

    NULL_POINT_EXCEPTION("201", "NULL POINT EXCEPTION 발생."),
    SQLINTEGRITY_CONSTRAINT_VIOLATION_EXCEPTION("202", "SQLINTEGRITY CONSTRAINT VIOLATION EXCEPTION 발생."),
    PERSISTANCE_EXCEPTION("203", "PERSISTANCE EXCEPTION 발생."),
    IO_EXCEPTION("204", "IO_EXCEPTION 발생."),
    NO_SEARCH_EXCEPTION("205", "NO SEARCH EXCEPTION 발생."),
    DIRECTORY_NOT_EMPTY_EXCEPTION("206", "DIRECTORY NOT EMPTY EXCEPTION 발생."),
    UUSERNAME_NOT_FOUND_EXCEPTION("207", "UUSERNAME NOT FOUND EXCEPTION 발생.");


    @Getter
    private String code;
    @Getter
    private String description;

    ErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
