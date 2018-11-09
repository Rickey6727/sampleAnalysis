package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCheerEvent;
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
public interface MCheerEventDao {

    /**
     * @param cheerEventId
     * @return the MCheerEvent entity
     */
    @Select
    Optional<MCheerEvent> selectById(Integer cheerEventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCheerEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCheerEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCheerEvent entity);
}