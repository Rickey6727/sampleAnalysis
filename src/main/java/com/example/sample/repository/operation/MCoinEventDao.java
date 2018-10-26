package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCoinEvent;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCoinEventDao {

    /**
     * @param eventId
     * @param eventType
     * @return the MCoinEvent entity
     */
    @Select
    MCoinEvent selectById(Integer eventId, Integer eventType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCoinEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCoinEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCoinEvent entity);
}