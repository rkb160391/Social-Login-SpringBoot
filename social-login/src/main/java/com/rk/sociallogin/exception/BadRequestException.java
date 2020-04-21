package com.rk.sociallogin.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.rk.sociallogin.controller.SequenceGenerator;

/**
 * @author Ravi Baghel
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BadRequestException.class);
	
    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
