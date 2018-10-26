package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TSheepShopHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TSheepShopHistoryDao {

    /**
     * @param serialId
     * @return the TSheepShopHistory entity
     */
    @Select
    TSheepShopHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSheepShopHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSheepShopHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSheepShopHistory entity);
}