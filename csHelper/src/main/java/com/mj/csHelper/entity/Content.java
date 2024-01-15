package com.mj.csHelper.entity;

import com.mj.csHelper.dto.ContentDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "content")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq; // 글 일련번호

    @NotNull
    private String title; // 글 제목

    @NotNull
    private String answer; // 글 내용

    @NotNull
    private LocalDateTime dateTime; // 작성 날짜

    @OneToOne
    @JoinColumn(name = "category_seq", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    Category category; // 카테고리

    public Content(ContentDto dto) {
        this.seq = dto.getSeq();
        this.title = dto.getTitle();
        this.answer = dto.getAnswer();
        this.dateTime = dto.getDateTime();
        this.category = dto.getCategory();
    }
}
