package com.company.common.sample.ui.restful.impl;

import com.company.common.sample.core.domain.dto.response.SampleResponseDto;
import com.company.common.sample.core.service.SampleService;
import com.company.common.sample.ui.restful.SampleOperations;
import com.company.common.spring.controller.restful.BaseController;
import com.company.common.spring.factory.response.Response;
import com.company.common.spring.factory.response.ResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SampleController extends BaseController implements SampleOperations {

    private final ResponseFactory responseFactory;
    private final SampleService sampleService;

    @GetMapping
    public ResponseEntity<Response<List<SampleResponseDto>>> example(){
        return responseFactory.success(sampleService.findAll());
    }
}
