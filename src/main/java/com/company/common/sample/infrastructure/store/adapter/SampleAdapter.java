package com.company.common.sample.infrastructure.store.adapter;

import com.company.common.persistence.BaseJPAAdapter;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.domain.entity.SampleEntity;
import com.company.common.sample.infrastructure.store.repository.SampleRepository;
import com.company.common.sample.core.port.store.SampleStore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class SampleAdapter extends BaseJPAAdapter<SampleEntity, Long, SampleRepository> implements SampleStore {

    @Override
    public Page<SampleEntity> listAllExample(Pageable pageable) {
        return super.findAll(pageable);
    }

    @Override
    public Page<SampleResDto> listByPage(Pageable pageable) {
        return super.repository.listByPage(pageable);
    }
}
