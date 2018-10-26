package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventNpcUseItem;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MRaiseEventNpcUseItemDao {

    /**
     * @param eventId
     * @param rare
     * @param useItemType
     * @return the MRaiseEventNpcUseItem entity
     */
    @Select
    MRaiseEventNpcUseItem selectById(Integer eventId, Short rare, Short useItemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventNpcUseItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventNpcUseItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventNpcUseItem entity);
}