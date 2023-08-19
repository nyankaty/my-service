package com.company.common.sample.core.service;

import com.company.common.sample.core.domain.dto.response.SampleResponseDto;

import java.util.List;

public interface SampleService {

    List<SampleResponseDto> findAll();
}
