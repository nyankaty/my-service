package com.company.sample.ui.restful.impl;

import com.company.common.spring.controller.restful.BaseController;
import com.company.common.spring.factory.response.Response;
import com.company.common.spring.factory.response.ResponseFactory;
import com.company.sample.core.domain.dto.response.ExampleResponseDTO;
import com.company.sample.core.service.ExampleService;
import com.company.sample.ui.restful.ExampleOperations;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ExampleController extends BaseController implements ExampleOperations {

    private final ResponseFactory responseFactory;
    private final ExampleService exampleService;

    @GetMapping
    public ResponseEntity<Response<List<ExampleResponseDTO>>> example(){
        return responseFactory.success(exampleService.findAll());
    }
}
