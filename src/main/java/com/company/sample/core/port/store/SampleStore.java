package com.company.sample.core.port.store;

import com.company.sample.core.domain.entity.SampleEntity;

import java.util.List;

public interface SampleStore {

    List<SampleEntity> listAllExample();
}
