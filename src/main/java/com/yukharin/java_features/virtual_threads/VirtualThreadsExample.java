package com.yukharin.java_features.virtual_threads;

import lombok.extern.slf4j.Slf4j;
import java.time.Duration;
import java.util.stream.IntStream;

@Slf4j
public class VirtualThreadsExample {

    private static final Integer N_THREADS = 10_000_000;

    public static void main(String[] args) throws InterruptedException {
        var start = java.time.Instant.now();
        log.info("Processors available: {}", Runtime.getRuntime().availableProcessors());
        var threads = IntStream.range(0, N_THREADS).mapToObj(i -> Thread.ofVirtual()
                .unstarted(() -> {})).toList();

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        var end = java.time.Instant.now();
        var durationSeconds = Duration.between(start, end).abs().getSeconds();
        log.info("Duration in seconds: {}", durationSeconds);
    }

}
