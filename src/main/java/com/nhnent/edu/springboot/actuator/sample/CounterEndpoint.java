package com.nhnent.edu.springboot.actuator.sample;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author myeongju.jung
 */
@Component
@Endpoint(id = "counter")
public class CounterEndpoint {
    private final AtomicLong counter = new AtomicLong();

    @ReadOperation
    public Long read() {
        return counter.get();
    }

    @WriteOperation
    public Long increment(@Nullable Long delta) {
        if (delta == null) {
            return counter.incrementAndGet();
        }
        return counter.addAndGet(delta);
    }
}
