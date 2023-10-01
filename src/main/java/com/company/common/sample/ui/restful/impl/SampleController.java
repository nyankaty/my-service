package com.company.common.sample.ui.restful.impl;

import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.service.SampleService;
import com.company.common.sample.ui.restful.SampleOperations;
import com.company.common.spring.factory.request.PagingRequest;
import com.company.common.spring.factory.response.Paging;
import com.company.common.spring.factory.response.Response;
import com.company.common.spring.factory.response.ResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@Slf4j
@RequiredArgsConstructor
public class SampleController implements SampleOperations {

    private final SampleService sampleService;

    @Override
    public Response<Paging<SampleResDto>> example(SampleReqDto request) {
        return Response.of(sampleService.findAll(request));
    }
}
