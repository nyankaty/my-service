package com.company.sample.infrastructure.store.repository;

import com.company.common.persistence.BaseJPARepository;
import com.company.sample.core.domain.entity.SampleEntity;

public interface SampleRepository extends BaseJPARepository<SampleEntity, Long> {

}
