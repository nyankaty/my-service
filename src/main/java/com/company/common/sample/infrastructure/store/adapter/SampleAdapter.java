package com.company.common.sample.infrastructure.store.adapter;

import com.company.common.persistence.BaseJPAAdapter;
import com.company.common.sample.core.domain.entity.SampleEntity;
import com.company.common.sample.infrastructure.store.repository.SampleRepository;
import com.company.common.sample.core.port.store.SampleStore;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleAdapter extends BaseJPAAdapter<SampleEntity, Long, SampleRepository> implements SampleStore {

    @Override
    public List<SampleEntity> listAllExample() {
        return super.findAll();
    }
}
