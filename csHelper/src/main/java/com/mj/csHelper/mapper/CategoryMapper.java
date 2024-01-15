package com.mj.csHelper.mapper;

import com.mj.csHelper.dto.CategoryDto;
import com.mj.csHelper.dto.CategoryRegisterDto;
import com.mj.csHelper.entity.Category;

public class CategoryMapper {

    /* CategoryDto -> Category entity 변환 */
    public static Category CategoryDtoToEntity(CategoryDto dto) {
        return Category.builder()
                .seq(dto.getSeq())
                .name(dto.getName())
                .build();
    }//CategoryDtoToEntity

    /* CategoryRegisterDto -> Category entity 변환 */
    public static Category registerDtoToEntity(CategoryRegisterDto dto) {
        return Category.builder()
                .name(dto.getName())
                .build();
    }//registerDtoToEntity

}//CategoryMapper
