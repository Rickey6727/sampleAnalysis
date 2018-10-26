package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPushMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MPushMessageDao {

    /**
     * @param pushMessageId
     * @return the MPushMessage entity
     */
    @Select
    MPushMessage selectById(Integer pushMessageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPushMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPushMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPushMessage entity);
}