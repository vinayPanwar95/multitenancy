package com.learning.multitenency.config;

import com.learning.multitenency.resolver.TenantInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * This class will add tenant Interceptor into Interceptor Registry
 * **/
@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final TenantInterceptor tenantInterceptor;

    @Override
   public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(tenantInterceptor);
    }
}
