package dev.ray.pointproducer.app.model;

public record PointUse(
        String content,
        long timestamp
) {
    public PointUse(String content) {
        this(content, System.currentTimeMillis());
    }
}
