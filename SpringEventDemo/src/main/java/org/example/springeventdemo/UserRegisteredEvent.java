package org.example.springeventdemo;


public record UserRegisteredEvent(
    String userId,
    String email
) {
}
