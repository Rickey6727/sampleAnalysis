package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TSheepBook;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TSheepBookDao {

    /**
     * @param accountId
     * @param sheepId
     * @return the TSheepBook entity
     */
    @Select
    TSheepBook selectById(Integer accountId, Integer sheepId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSheepBook entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSheepBook entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSheepBook entity);
}