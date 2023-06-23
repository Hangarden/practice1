package com.example.practice1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private Integer boardId;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private Integer read;
    private String name;
    private Long memberId;

    public Board(String title, String content, String name) {
        this.title = title;
        this.content = content;
        this.name = name;
    }

}
