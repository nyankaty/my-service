package com.company.sample.infrastructure.store.adapter;

import com.company.common.persistence.BaseJPAAdapter;
import com.company.sample.core.domain.entity.SampleEntity;
import com.company.sample.core.port.store.SampleStore;
import com.company.sample.infrastructure.store.repository.SampleRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleAdapter extends BaseJPAAdapter<SampleEntity, Long, SampleRepository> implements SampleStore {

    @Override
    public List<SampleEntity> listAllExample() {
        return super.findAll();
    }
}
