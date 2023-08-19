package com.company.common.sample.core.port.messaging;

import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.Map;

public interface MessagingPort {

    <T> void pushAsync(T payload, String topic, ListenableFutureCallback<String> callback);

    <T> void pushAsync(T payload, String topic);

    <T> boolean pushSync(T payload, String topic);

    <T> boolean pushSync(T payload, String topic, Map<String, byte[]> headers, Integer partition);
}
