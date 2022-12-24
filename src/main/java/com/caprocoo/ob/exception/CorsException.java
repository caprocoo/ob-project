package com.caprocoo.ob.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
        value = HttpStatus.NO_CONTENT
)
public class CorsException extends RuntimeException {
}
