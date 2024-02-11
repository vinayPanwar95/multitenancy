package com.learning.multitenency.resolver;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

@FunctionalInterface
public interface TenantResolver<T> {
    String resolveTenantId(@NotNull T object);
}
