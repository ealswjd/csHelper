package com.mj.csHelper.service;

import com.mj.csHelper.dto.CategoryRegisterDto;
import com.mj.csHelper.entity.Category;
import com.mj.csHelper.mapper.CategoryMapper;
import com.mj.csHelper.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    /* 카테고리 등록 */
    @Override
    public Long registerCategory(CategoryRegisterDto dto) {
        Category category = CategoryMapper.registerDtoToEntity(dto);
        categoryRepository.save(category);

        return category.getSeq();
    }//registerCategory

    /* 카테고리 조회 */
    @Override
    public Category getCategory(Long categorySeq) {
        Category category = categoryRepository.findById(categorySeq)
                .orElse(Category.builder().seq(0L).name("카테고리 없음").build());

        return category;
    }//getCategory

}//CategoryServiceImpl
