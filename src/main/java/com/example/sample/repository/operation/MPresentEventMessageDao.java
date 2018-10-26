package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPresentEventMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MPresentEventMessageDao {

    /**
     * @param messageId
     * @return the MPresentEventMessage entity
     */
    @Select
    MPresentEventMessage selectById(Integer messageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPresentEventMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPresentEventMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPresentEventMessage entity);
}