package com.rk.sociallogin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.sociallogin.exception.ResourceNotFoundException;
import com.rk.sociallogin.model.User;
import com.rk.sociallogin.repository.UserRepository;
import com.rk.sociallogin.security.CurrentUser;
import com.rk.sociallogin.security.RestAuthenticationEntryPoint;
import com.rk.sociallogin.security.UserPrincipal;

/**
 * @author Ravi Baghel
 *
 */
@RestController
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
    	LOGGER.info("Current User : "+userPrincipal.toString());
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
