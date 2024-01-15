package com.mj.csHelper.controller;

import com.mj.csHelper.dto.ContentRegisterDto;
import com.mj.csHelper.service.ContentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
@Slf4j
public class ContentController {

    private final ContentService contentService;

    /* 게시글 등록 */
    @PostMapping
    public ResponseEntity<?> registerContent(@RequestBody ContentRegisterDto dto) {
        LocalDateTime dateTime = LocalDateTime.now();
        dto.setDateTime(dateTime);
        Long seq = contentService.registerContent(dto);

        return ResponseEntity.ok(seq);
    }

}//ContentController
