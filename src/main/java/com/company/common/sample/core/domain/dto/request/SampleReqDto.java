package com.company.common.sample.core.domain.dto.request;

import com.company.common.spring.factory.request.PagingRequest;

import java.io.Serializable;

public class SampleReqDto extends PagingRequest {

    private String columnOne;

    public String getColumnOne() {
        return columnOne;
    }

    public void setColumnOne(String columnOne) {
        this.columnOne = columnOne;
    }
}
