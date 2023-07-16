package com.company.sample.infrastructure.messaging;

import com.company.common.kafka.adapter.KafkaPublisher;
import com.company.sample.core.port.messaging.MessagingPort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaAdapter extends KafkaPublisher implements MessagingPort {
    public KafkaAdapter(@Qualifier("defaultKafkaTemplate") KafkaTemplate<String, String> kafkaTemplate) {
        super(kafkaTemplate);
    }
}
