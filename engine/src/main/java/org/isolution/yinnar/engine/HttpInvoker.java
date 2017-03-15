package org.isolution.yinnar.engine;

import org.isolution.yinnar.message.Message;
import org.isolution.yinnar.routing.Endpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpInvoker implements Invoker {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpInvoker.class);

    @Override
    public Message invoke(final Endpoint endpoint,
                          final Message payload) {
        LOGGER.debug("About to invoke [{}]", endpoint);
        return null;
    }
}
