package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TSheepBonusHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TSheepBonusHistoryDao {

    /**
     * @param serialId
     * @return the TSheepBonusHistory entity
     */
    @Select
    TSheepBonusHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSheepBonusHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSheepBonusHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSheepBonusHistory entity);
}