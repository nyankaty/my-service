package com.company.common.sample.ui.restful;

import com.company.common.spring.factory.response.Response;
import com.company.common.sample.core.domain.dto.response.SampleResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("${apiUrl}")
public interface SampleOperations {

    @Operation(summary = "Get example")
    @GetMapping(value = "example")
    ResponseEntity<Response<List<SampleResponseDto>>> example();
}
