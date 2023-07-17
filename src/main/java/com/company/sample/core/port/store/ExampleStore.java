package com.company.sample.core.port.store;

import com.company.sample.core.domain.entity.ExampleEntity;

import java.util.List;

public interface ExampleStore {
    List<ExampleEntity> listAllExample();
}
