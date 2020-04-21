package com.rk.sociallogin.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

import com.rk.sociallogin.SocialLoginApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravi Baghel
 *
 */
@ConfigurationProperties(prefix = "app")
public class AppProperties {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppProperties.class);

	private final Auth auth = new Auth();
	private final OAuth2 oauth2 = new OAuth2();

	public static class Auth {
		private String tokenSecret;
		private long tokenExpirationMsec;

		public String getTokenSecret() {
			return tokenSecret;
		}

		public void setTokenSecret(String tokenSecret) {
			this.tokenSecret = tokenSecret;
		}

		public long getTokenExpirationMsec() {
			return tokenExpirationMsec;
		}

		public void setTokenExpirationMsec(long tokenExpirationMsec) {
			this.tokenExpirationMsec = tokenExpirationMsec;
		}
	}

	public static final class OAuth2 {
		private List<String> authorizedRedirectUris = new ArrayList<>();

		public List<String> getAuthorizedRedirectUris() {
			return authorizedRedirectUris;
		}

		public OAuth2 authorizedRedirectUris(List<String> authorizedRedirectUris) {
			this.authorizedRedirectUris = authorizedRedirectUris;
			return this;
		}
	}

	public Auth getAuth() {
		return auth;
	}

	public OAuth2 getOauth2() {
		return oauth2;
	}
}
