package com.company.common.sample.application.rest.impl;

import com.company.common.client.application.ClientTemplate;
import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.service.SampleService;
import com.company.common.sample.infrastructure.cache.CacheTemplateAdapter;
import com.company.common.sample.application.rest.SampleOperations;
import com.company.common.spring.factory.response.Paging;
import com.company.common.spring.factory.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
@Slf4j
@RequiredArgsConstructor
public class SampleController implements SampleOperations {

    private final SampleService sampleService;
    private final ClientTemplate clientTemplate;
    private final CacheTemplateAdapter externalCacheTemplate;

    @Override
    public Response<Paging<SampleResDto>> example(SampleReqDto request) {
        return Response.of(sampleService.findAll(request));
    }

    @Override
    public String get() {
//        return Mono.just("sgd");
//        externalCacheTemplate.getObject("sggs", "sg");
        return WebClient.create("http://192.168.0.103:7777").get().uri("/config")
                .retrieve().bodyToMono(String.class).block();

//        return clientTemplate.get("http://localhost:7777/config", null, 10, String.class);
    }
}
