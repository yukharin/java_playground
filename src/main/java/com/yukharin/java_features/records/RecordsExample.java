package com.yukharin.java_features.records;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RecordsExample {

    public static void main(String[] args) {
        var point1 = new Point(1, 30);
        var point2 = new Point(1, 35);
        log.info("Points: {},{}", point1, point2);
        log.info("Points are equal: {}", point1.equals(point2));
        log.info("Point's hashcodes: {}, {}", point1.hashCode(), point2.hashCode());
    }

}
