package org.isolution.yinnar.routing;

import org.isolution.yinnar.message.Message;

import java.net.URI;

public interface Endpoint {

  Message invoke(Message payload);

  URI uri();
}
