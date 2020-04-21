package com.rk.sociallogin.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;

/**
 * @author Ravi Baghel
 *
 */
public class OAuth2AuthenticationProcessingException extends AuthenticationException {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OAuth2AuthenticationProcessingException.class);
	
    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }
}
