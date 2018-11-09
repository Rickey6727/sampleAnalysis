package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEvent;
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
public interface MEventDao {

    /**
     * @param eventId
     * @param incidentType
     * @return the MEvent entity
     */
    @Select
    Optional<MEvent> selectById(Integer eventId, Integer incidentType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEvent entity);
}