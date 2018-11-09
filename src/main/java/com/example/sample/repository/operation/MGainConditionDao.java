package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MGainCondition;
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
public interface MGainConditionDao {

    /**
     * @param gainId
     * @return the MGainCondition entity
     */
    @Select
    Optional<MGainCondition> selectById(Integer gainId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGainCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGainCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGainCondition entity);
}