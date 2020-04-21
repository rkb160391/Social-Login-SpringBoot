package com.rk.sociallogin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import com.rk.sociallogin.config.AppProperties;
import com.rk.sociallogin.controller.UserController;

/**
 * @author Ravi Baghel
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@PropertySource(value = "classpath:application.yml")
public class SocialLoginApplication {

	public static String port;

	private static final Logger LOGGER = LoggerFactory.getLogger(SocialLoginApplication.class);

	public static void main(String[] args) {
		LOGGER.info("============================================================================");
		LOGGER.info("||                                                                        ||");
		LOGGER.info("||                   SocialLogin Service Starting...                      ||");
		LOGGER.info("||                                                                        ||");
		LOGGER.info("============================================================================");

		SpringApplication.run(SocialLoginApplication.class, args);
		LOGGER.info("============================================================================");
		LOGGER.info("||                                                                        ||");
		LOGGER.info("||        SocialLogin Service Started Successfully on port: " + port + "  ||");
		LOGGER.info("||                                                                        ||");
		LOGGER.info("============================================================================");
	}

	@Value("${server.port}")
	public void setServerPort(String port) {
		this.port = port;
	}
}
