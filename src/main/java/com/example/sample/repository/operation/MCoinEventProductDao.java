package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCoinEventProduct;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCoinEventProductDao {

    /**
     * @param eventId
     * @param nativeType
     * @param productId
     * @return the MCoinEventProduct entity
     */
    @Select
    MCoinEventProduct selectById(Integer eventId, Integer nativeType, String productId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCoinEventProduct entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCoinEventProduct entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCoinEventProduct entity);
}