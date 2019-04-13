package com.nhn.edu.springboot.actuator.sample.counter;

import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.lang.Nullable;

/**
 * @author myeongju.jung
 */
//@EndpointWebExtension(endpoint = CounterEndpoint.class)
//@Component
public class CounterWebEndPoint {
    private final CounterEndpoint target;

    public CounterWebEndPoint(CounterEndpoint target) {
        this.target = target;
    }

    //@WriteOperation
    public WebEndpointResponse<Long> increment(@Nullable Long delta) {
        return new WebEndpointResponse<>(target.increment(delta));
    }
}
