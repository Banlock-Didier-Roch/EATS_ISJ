package org.isj.eats_isj.webapp.service;

import java.util.Map;
import java.util.Optional;

import org.isj.eats_isj.webapp.domaine.dto.LocalUser;
import org.isj.eats_isj.webapp.domaine.dto.SignUpRequest;
import org.isj.eats_isj.webapp.domaine.entities.User;
import org.isj.eats_isj.webapp.exception.UserAlreadyExistAuthenticationException;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;


/**
 * @author Chinna
 * @since 26/3/18
 */
public interface UserService {

    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

    User findUserByEmail(String email);

    Optional<User> findUserById(Long id);

    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}