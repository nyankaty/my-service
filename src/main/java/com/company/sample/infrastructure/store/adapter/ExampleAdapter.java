package com.company.sample.infrastructure.store.adapter;

import com.company.common.persistence.BaseJPAAdapter;
import com.company.sample.core.domain.entity.ExampleEntity;
import com.company.sample.core.port.store.ExampleStore;
import com.company.sample.infrastructure.store.repository.ExampleRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExampleAdapter extends BaseJPAAdapter<ExampleEntity, Long, ExampleRepository> implements ExampleStore {

    @Override
    public List<ExampleEntity> listAllExample() {
        return super.findAll();
    }
}
