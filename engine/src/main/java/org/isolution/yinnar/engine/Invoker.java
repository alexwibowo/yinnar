package org.isolution.yinnar.engine;

import org.isolution.yinnar.message.Message;
import org.isolution.yinnar.routing.Endpoint;

public interface Invoker {

    Message invoke(Endpoint endpoint, Message payload);
}
