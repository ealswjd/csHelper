package com.mj.csHelper.service;

import com.mj.csHelper.dto.CategoryRegisterDto;
import com.mj.csHelper.entity.Category;

public interface CategoryService {
    /* 카테고리 등록 */
    public Long registerCategory(CategoryRegisterDto dto);

    /* 카테고리 조회 */
    public Category getCategory(Long categorySeq);

}//CategoryService
