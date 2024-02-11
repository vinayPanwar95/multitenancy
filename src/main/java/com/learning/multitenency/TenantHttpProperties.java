package com.learning.multitenency;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "multitenancy.http")
@Configuration
@Data
public class TenantHttpProperties {
    private String headerName;
}


