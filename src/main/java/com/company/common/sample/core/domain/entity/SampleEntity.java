package com.company.common.sample.core.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "sample")
public class SampleEntity {

    @Id
    private Long id;

    @Column(name = "column_one")
    private String columnOne;

    @Column(name = "column_two")
    private String columnTwo;
}
