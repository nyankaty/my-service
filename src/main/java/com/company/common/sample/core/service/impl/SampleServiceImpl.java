package com.company.common.sample.core.service.impl;

import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.domain.entity.SampleEntity;
import com.company.common.sample.core.domain.mapper.SampleMapper;
import com.company.common.sample.core.service.SampleService;
import com.company.common.sample.core.port.store.SampleStore;
import com.company.common.spring.factory.request.PagingRequest;
import com.company.common.spring.factory.response.Paging;
import com.company.common.spring.factory.response.PagingFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class SampleServiceImpl implements SampleService {

    private final SampleStore sampleStore;
    private final SampleMapper sampleMapper;

    @Override
    public Paging<SampleResDto> findAll(SampleReqDto request) {
        PagingFactory pagingFactory = new PagingFactory();
        Page<SampleResDto> page = sampleStore.listByPage(pagingFactory.createPageable(request));

        return new Paging<>(page.getContent(), page.getTotalElements());
    }
}
