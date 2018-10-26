package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TCareHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TCareHistoryDao {

    /**
     * @param serialId
     * @return the TCareHistory entity
     */
    @Select
    TCareHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCareHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCareHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCareHistory entity);
}