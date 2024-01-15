package com.mj.csHelper.service;

import com.mj.csHelper.dto.ContentRegisterDto;
import com.mj.csHelper.entity.Category;
import com.mj.csHelper.entity.Content;
import com.mj.csHelper.mapper.ContentMapper;
import com.mj.csHelper.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class ContentServiceImpl implements ContentService{
    private final ContentRepository contentRepository;
    private final CategoryService categoryService;

    /* 게시글 등록 */
    @Override
    public Long registerContent(ContentRegisterDto contentRegisterDto) {
        Category category = categoryService.getCategory(contentRegisterDto.getCategorySeq());
        Content content = ContentMapper.registerDtoToEntity(contentRegisterDto, category);
        contentRepository.save(content);

        return content.getSeq();
    }//registerContent


}//ContentServiceImpl
