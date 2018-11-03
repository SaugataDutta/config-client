package com.example.config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {
    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public String testConfigClient() {
        return this.message;
    }
}
