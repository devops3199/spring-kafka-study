package dev.ray.pointproducer.app.producer;

import dev.ray.pointproducer.app.model.PointUse;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointUseProducerService {

    private final KafkaTemplate<String, PointUse> kafkaTemplate;

    public void sendMessage(PointUse message) {
        kafkaTemplate.send("use-points", message);
    }
}
