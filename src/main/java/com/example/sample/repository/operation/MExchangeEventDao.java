package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MExchangeEvent;
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
public interface MExchangeEventDao {

    /**
     * @param eventId
     * @param eventType
     * @param exchangeId
     * @return the MExchangeEvent entity
     */
    @Select
    Optional<MExchangeEvent> selectById(Integer eventId, Integer eventType, Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MExchangeEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MExchangeEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MExchangeEvent entity);
}