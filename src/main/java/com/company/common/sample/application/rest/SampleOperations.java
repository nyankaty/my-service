package com.company.common.sample.application.rest;

import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.spring.factory.response.Paging;
import com.company.common.spring.factory.response.Response;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RequestMapping("${apiUrl}")
@Validated
public interface SampleOperations {

    @Operation(summary = "Get example")
    @GetMapping( "/example")
    Response<Paging<SampleResDto>> example(@Valid SampleReqDto request);

    @GetMapping("/redirect")
    String get();
}
