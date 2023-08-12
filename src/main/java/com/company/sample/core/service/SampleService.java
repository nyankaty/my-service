package com.company.sample.core.service;

import com.company.sample.core.domain.dto.response.SampleResponseDto;

import java.util.List;

public interface SampleService {

    List<SampleResponseDto> findAll();
}
