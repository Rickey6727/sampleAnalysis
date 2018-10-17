package com.example.sample.domain.repository;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import com.example.sample.domain.model.SampleEntity;
import org.springframework.stereotype.Repository;

@ConfigAutowireable
@Dao
@Repository
public interface SampleRepository {

    @Select
    List<Integer> selectAll();

}