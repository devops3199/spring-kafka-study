package dev.ray.pointconsumer.app.controller;

import dev.ray.pointconsumer.app.consumer.PointUseConsumerService;
import dev.ray.pointconsumer.app.model.PointUse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/points")
@RequiredArgsConstructor
public class PointController {

    private final PointUseConsumerService pointUseConsumerService;

    @GetMapping("/use")
    public List<PointUse> getPointUseList() {
        return pointUseConsumerService.getReceivedMessages();
    }
}
