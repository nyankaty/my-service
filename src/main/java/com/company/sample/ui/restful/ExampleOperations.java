package com.company.sample.ui.restful;

import com.company.common.spring.factory.response.Response;
import com.company.sample.core.domain.dto.response.ExampleResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface ExampleOperations {

    @Operation(summary = "Get example")
    @GetMapping(value = "example")
    ResponseEntity<Response<List<ExampleResponseDTO>>> example();
}
