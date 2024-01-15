package com.mj.csHelper.dto;

import com.mj.csHelper.entity.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ContentDto {
    private Long seq; // 글 일련번호
    private String title; // 글 제목
    private String answer; // 글 내용
    private LocalDateTime dateTime; // 작성 날짜
    private Category category; // 카테고리
}//ContentDto
