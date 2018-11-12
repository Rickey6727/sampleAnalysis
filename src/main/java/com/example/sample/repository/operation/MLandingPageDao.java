package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MLandingPage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MLandingPageDao {

    /**
     * @param visit
     * @return the MLandingPage entity
     */
    @Select
    Optional<MLandingPage> selectById(String visit);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLandingPage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLandingPage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLandingPage entity);
}