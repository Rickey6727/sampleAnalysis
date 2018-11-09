package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCheerEventDetail;
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
public interface MCheerEventDetailDao {

    /**
     * @param cheerEventId
     * @param eventTypeId
     * @param conditionOrder
     * @return the MCheerEventDetail entity
     */
    @Select
    Optional<MCheerEventDetail> selectById(Integer cheerEventId, Integer eventTypeId, Integer conditionOrder);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCheerEventDetail entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCheerEventDetail entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCheerEventDetail entity);
}