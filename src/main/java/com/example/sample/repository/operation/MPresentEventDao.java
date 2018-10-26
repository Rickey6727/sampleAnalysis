package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPresentEvent;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MPresentEventDao {

    /**
     * @param eventId
     * @return the MPresentEvent entity
     */
    @Select
    MPresentEvent selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPresentEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPresentEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPresentEvent entity);
}