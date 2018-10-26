package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TStableHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TStableHistoryDao {

    /**
     * @param serialId
     * @return the TStableHistory entity
     */
    @Select
    TStableHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TStableHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TStableHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TStableHistory entity);
}