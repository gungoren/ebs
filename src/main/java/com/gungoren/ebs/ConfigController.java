package com.gungoren.ebs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${datasource.url}")
    private String dataSourceUrl;

    @Value("${datasource.username}")
    private String dataSourceName;

    @GetMapping("/properties")
    public String getProperties(){
        return String.format("v3 -> %s %s", dataSourceUrl, dataSourceName);
    }
}
