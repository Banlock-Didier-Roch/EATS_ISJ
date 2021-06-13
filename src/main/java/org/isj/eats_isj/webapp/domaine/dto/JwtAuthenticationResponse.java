package org.isj.eats_isj.webapp.domaine.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
    private String accessToken;
    private UserInfo user;

    public JwtAuthenticationResponse(String accessToken, UserInfo user) {
        this.accessToken = accessToken;
        this.user = user;
    }
}