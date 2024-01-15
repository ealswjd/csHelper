package com.mj.csHelper.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="category")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq; // 카테고리 일련번호

    @NotNull
    private String name; // 카테고리 이름

}//Category
