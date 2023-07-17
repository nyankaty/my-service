package com.company.sample.core.service;

import com.company.sample.core.domain.dto.response.ExampleResponseDTO;

import java.util.List;

public interface ExampleService {
    List<ExampleResponseDTO> findAll();
}
