package com.learning.multitenency.resolver;

import com.learning.multitenency.TenantHttpProperties;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class HttpHeaderTenantResolver implements TenantResolver<HttpServletRequest>{

    private final TenantHttpProperties tenantHttpProperties;
    @Override
    public String resolveTenantId(HttpServletRequest request) {
        log.info("tenant Http header name: {}" , tenantHttpProperties.getHeaderName());
        log.info("tenantId:  {} reterived from request : {}" ,request.getHeader(tenantHttpProperties.getHeaderName()) , request);
        return request.getHeader(tenantHttpProperties.getHeaderName());
    }
}
