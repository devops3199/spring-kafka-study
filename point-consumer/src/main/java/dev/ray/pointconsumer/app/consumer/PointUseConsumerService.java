package dev.ray.pointconsumer.app.consumer;

import dev.ray.pointconsumer.app.model.PointUse;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PointUseConsumerService {

    private final List<PointUse> receivedMessages = new ArrayList<>();

    @KafkaListener(topics = "use-points", groupId = "point-team")
    public void consume(PointUse message) {
        System.out.println("[points-use] Received message: " + message);
    }

    public List<PointUse> getReceivedMessages() {
        return Collections.unmodifiableList(receivedMessages);
    }
}
