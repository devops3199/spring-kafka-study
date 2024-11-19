package dev.ray.pointproducer.app.controller;

import dev.ray.pointproducer.app.model.PointUse;
import dev.ray.pointproducer.app.producer.PointUseProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/points")
@RequiredArgsConstructor
public class PointController {

    private final PointUseProducerService pointUseProducerService;

    @PostMapping("/use")
    public void usePoints(@RequestBody PointUse message) {
        pointUseProducerService.sendMessage(message);
    }
}
