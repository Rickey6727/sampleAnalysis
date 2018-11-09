package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPushCondition;
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
public interface MPushConditionDao {

    /**
     * @param pushId
     * @return the MPushCondition entity
     */
    @Select
    Optional<MPushCondition> selectById(Integer pushId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPushCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPushCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPushCondition entity);
}