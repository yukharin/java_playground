package com.yukharin.java_features.text_blocks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextBlockExample {

    public static void main(String[] args) {
        var multipleLineText = """ 
                SELECT * FROM person p
                JOIN book b ON p.id = b.person_id
                where p.age > 18
                """;

        var oneLineText = """
                SELECT * FROM person p\
                JOIN book b ON p.id = b.person_id\
                where p.age > 18
                """;

        log.info("Multiple line text: [{}]", multipleLineText);
        log.info("One line text: [{}]", oneLineText);
    }

}
