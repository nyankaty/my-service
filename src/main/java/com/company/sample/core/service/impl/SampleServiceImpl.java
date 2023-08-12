package com.company.sample.core.service.impl;

import com.company.sample.core.domain.dto.response.SampleResponseDto;
import com.company.sample.core.port.store.SampleStore;
import com.company.sample.core.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class SampleServiceImpl implements SampleService {

    private final SampleStore sampleStore;

    @Override
    public List<SampleResponseDto> findAll() {
        return sampleStore.listAllExample().stream().map(item -> SampleResponseDto.builder()
                .columnOne(item.getColumnOne())
                .columnTwo(item.getColumnTwo())
                .build())
                .collect(Collectors.toList());
    }
}
