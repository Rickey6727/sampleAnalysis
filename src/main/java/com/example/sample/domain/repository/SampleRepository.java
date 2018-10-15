package com.example.sample.domain.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.sample.domain.model.SampleEntity;

@ConfigAutowireable
@Dao
public interface SampleRepository {

    @Select
    List<SampleEntity> selectAll();

}