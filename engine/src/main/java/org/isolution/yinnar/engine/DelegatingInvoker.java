package org.isolution.yinnar.engine;

import java.util.Objects;

public abstract class DelegatingInvoker {

    private final Invoker delegate;

    public DelegatingInvoker(final Invoker delegate) {
        this.delegate = Objects.requireNonNull(delegate);
    }
}
