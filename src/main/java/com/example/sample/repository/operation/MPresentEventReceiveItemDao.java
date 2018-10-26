package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPresentEventReceiveItem;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MPresentEventReceiveItemDao {

    /**
     * @param eventId
     * @param subId
     * @return the MPresentEventReceiveItem entity
     */
    @Select
    MPresentEventReceiveItem selectById(Integer eventId, Integer subId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPresentEventReceiveItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPresentEventReceiveItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPresentEventReceiveItem entity);
}