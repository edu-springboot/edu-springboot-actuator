package com.nhn.edu.springboot.actuator.sample.health;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author myeongju.jung
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
class ForbiddenException extends RuntimeException {
    ForbiddenException(String ip) {
        super(ip);
    }
}
