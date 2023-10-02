package com.company.common.sample.ui.restful.impl;

import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.service.SampleService;
import com.company.common.sample.infrastructure.client.ClientTemplateAdapter;
import com.company.common.sample.ui.restful.SampleOperations;
import com.company.common.spring.factory.response.Paging;
import com.company.common.spring.factory.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
@Slf4j
@RequiredArgsConstructor
public class SampleController implements SampleOperations {

    private final SampleService sampleService;
    private final ClientTemplateAdapter clientTemplate;

    @Override
    public Response<Paging<SampleResDto>> example(SampleReqDto request) {
        return Response.of(sampleService.findAll(request));
    }

    @Override
    public String get() {
//        return Mono.just("sgd");
        return WebClient.create("http://192.168.0.103:7777").get().uri("/config")
                .retrieve().bodyToMono(String.class).block();
//        return clientTemplate.get("http://localhost:7777/config", null, 10, String.class);
    }
}
