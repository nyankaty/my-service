package com.company.common.sample.infrastructure.store.repository;

import com.company.common.persistence.BaseJPARepository;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.domain.entity.SampleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface SampleRepository extends BaseJPARepository<SampleEntity, Long> {

    @Query("SELECT s FROM SampleEntity s")
    Page<SampleResDto> listByPage(Pageable pageable);
}
