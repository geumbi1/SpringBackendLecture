package org.example.springsecurityjwtdemo;

import lombok.Builder;

@Builder
public record TokenRefreshResponse(
    boolean success,
    String accessToken,
    String tokenType
) {
}
