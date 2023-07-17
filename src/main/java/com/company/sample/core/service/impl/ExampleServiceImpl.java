package com.company.sample.core.service.impl;

import com.company.sample.core.domain.dto.response.ExampleResponseDTO;
import com.company.sample.core.port.store.ExampleStore;
import com.company.sample.core.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExampleServiceImpl implements ExampleService {

    private final ExampleStore exampleStore;

    @Override
    public List<ExampleResponseDTO> findAll() {
        return exampleStore.findAll().stream().map(item -> ExampleResponseDTO.builder()
                .columnOne(item.getColumnOne())
                .columnTwo(item.getColumnTwo())
                .build())
                .collect(Collectors.toList());
    }
}
