package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TCoinEvent;
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
public interface TCoinEventDao {

    /**
     * @param accountId
     * @param eventId
     * @param nativeType
     * @param productId
     * @return the TCoinEvent entity
     */
    @Select
    Optional<TCoinEvent> selectById(Integer accountId, Integer eventId, Integer nativeType, String productId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCoinEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCoinEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCoinEvent entity);
}