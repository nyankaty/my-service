package com.company.common.sample.core.port.store;

import com.company.common.sample.core.domain.entity.SampleEntity;

import java.util.List;

public interface SampleStore {

    List<SampleEntity> listAllExample();
}
