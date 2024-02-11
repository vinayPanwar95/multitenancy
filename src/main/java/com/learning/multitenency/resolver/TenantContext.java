package com.learning.multitenency.resolver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TenantContext {
    private static final ThreadLocal<String> tenantId = new ThreadLocal<>();

    public static void setTenantId(String tenant){
        log.info("Setting current tenant to {}", tenant);
        tenantId.set(tenant);
    }

    public  static String getTenantId(){
        return tenantId.get();
    }

    public static void clear(){
        tenantId.remove();
    }
}
