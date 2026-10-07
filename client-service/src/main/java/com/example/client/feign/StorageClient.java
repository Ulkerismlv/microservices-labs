package com.example.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "storage-service", url = "${storage.service.url}")
public interface StorageClient {

    @GetMapping("/api/storage/ping")
    Map<String, Object> ping();

    @GetMapping("/api/storage/greet/{name}")
    String greet(@PathVariable("name") String name);
}
