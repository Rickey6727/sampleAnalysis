package com.example.sample.domain.model;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "sample")
public class SampleEntity {

    @Id
    private int id;

//    private String name;

//～ getter, setter 省略 ～

}