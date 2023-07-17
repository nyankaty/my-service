package com.company.sample.infrastructure.store.repository;

import com.company.common.persistence.BaseJPARepository;
import com.company.sample.core.domain.entity.ExampleEntity;

public interface ExampleRepository extends BaseJPARepository<ExampleEntity, Long> {

}
