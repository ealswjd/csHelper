package com.mj.csHelper.controller;

import com.mj.csHelper.dto.CategoryRegisterDto;
import com.mj.csHelper.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    /* 카테고리 등록 */
    @PostMapping
    public ResponseEntity<?> registerCategory(@RequestBody CategoryRegisterDto dto) {
        Long seq = categoryService.registerCategory(dto);

        return ResponseEntity.ok(seq);
    }



}//CategoryController
