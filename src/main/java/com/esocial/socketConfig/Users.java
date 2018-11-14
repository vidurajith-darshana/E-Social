package com.esocial.socketConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component
@Scope(value = "singleton")
public class Users {

    private Map<Integer, Set<String>> userSessions;

    public Map<Integer, Set<String>> getUserSessions() {
        return userSessions;
    }

    public void setUserSessions(Map<Integer, Set<String>> userSessions) {
        this.userSessions = userSessions;
    }
}
