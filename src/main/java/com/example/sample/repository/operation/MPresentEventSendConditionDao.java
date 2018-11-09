package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPresentEventSendCondition;
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
public interface MPresentEventSendConditionDao {

    /**
     * @param eventId
     * @return the MPresentEventSendCondition entity
     */
    @Select
    Optional<MPresentEventSendCondition> selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPresentEventSendCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPresentEventSendCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPresentEventSendCondition entity);
}