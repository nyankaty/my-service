package com.company.common.sample.core.port.store;

import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.domain.entity.SampleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SampleStore {

    Page<SampleEntity> listAllExample(Pageable pageable);

    Page<SampleResDto> listByPage(Pageable pageable);
}
