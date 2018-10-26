package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TSheepState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TSheepStateDao {

    /**
     * @param accountId
     * @param orderId
     * @return the TSheepState entity
     */
    @Select
    TSheepState selectById(Integer accountId, Integer orderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSheepState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSheepState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSheepState entity);
}