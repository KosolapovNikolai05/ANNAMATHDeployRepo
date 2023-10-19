package com.example.ANNAMATH;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Homework {
    private LocalDateTime timestamp;
    private String content;

    private boolean isLink;

    public Homework(String content , boolean isLink){
        timestamp = LocalDateTime.now();
        this.isLink = isLink;
        this.content = content;
    }
}
