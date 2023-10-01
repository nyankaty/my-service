package com.company.common.sample.core.domain.mapper;

import com.company.common.sample.core.domain.dto.request.SampleReqDto;
import com.company.common.sample.core.domain.dto.response.SampleResDto;
import com.company.common.sample.core.domain.entity.SampleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SampleMapper {

    SampleEntity toEntity(SampleReqDto sampleReqDto);

    List<SampleEntity> toEntity(List<SampleReqDto> listSampleReqDto);

    SampleResDto fromEntity(SampleEntity entity);

    List<SampleResDto> fromEntity(List<SampleEntity> listEntities);
}
