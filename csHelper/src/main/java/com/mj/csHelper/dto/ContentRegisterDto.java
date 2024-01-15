package com.mj.csHelper.dto;

import lombok.*;

import java.time.LocalDateTime;

/* 게시글 등록 DTO */
@Getter
@Setter
@NoArgsConstructor
public class ContentRegisterDto {
    private String title; // 글 제목
    private String answer; // 글 내용
    private LocalDateTime dateTime; // 작성 날짜
    private Long categorySeq; // 카테고리 일련번호

    @Builder
    public ContentRegisterDto(String title, String answer, LocalDateTime dateTime, Long categorySeq) {
        this.title = title;
        this.answer = answer;
        this.dateTime = dateTime;
        this.categorySeq = categorySeq;
    }

}//ContentRegisterDto
