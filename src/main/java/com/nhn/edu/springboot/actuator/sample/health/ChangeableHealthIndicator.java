package com.nhn.edu.springboot.actuator.sample.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * @author myeongju.jung
 */
public interface ChangeableHealthIndicator extends HealthIndicator {
    void changeHealth(Health health);
}
