package com.mz.app.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "goods")
@Component
public interface GoodsClient {
    @GetMapping("/msg")
    String getMes();
}
