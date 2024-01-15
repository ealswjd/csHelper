package com.mj.csHelper.mapper;

import com.mj.csHelper.dto.ContentRegisterDto;
import com.mj.csHelper.entity.Category;
import com.mj.csHelper.entity.Content;

public class ContentMapper {

    /* registerDto -> Content entity 변환 */
    public static Content registerDtoToEntity(ContentRegisterDto dto, Category category) {
        return Content.builder()
                .title(dto.getTitle())
                .answer(dto.getAnswer())
                .dateTime(dto.getDateTime())
                .category(category)
                .build();
    }

}//ContentMapper
