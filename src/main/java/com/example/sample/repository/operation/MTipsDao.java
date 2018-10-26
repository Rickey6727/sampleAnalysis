package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTips;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MTipsDao {

    /**
     * @param tipsId
     * @return the MTips entity
     */
    @Select
    MTips selectById(Integer tipsId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTips entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTips entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTips entity);
}