package com.company.common.sample.core.service;

import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.spring.factory.request.PagingRequest;
import com.company.common.spring.factory.response.Paging;

public interface SampleService {

    Paging<SampleResDto> findAll(SampleReqDto request);

}
