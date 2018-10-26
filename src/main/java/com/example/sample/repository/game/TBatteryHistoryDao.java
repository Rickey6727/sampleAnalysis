package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TBatteryHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TBatteryHistoryDao {

    /**
     * @param serialId
     * @return the TBatteryHistory entity
     */
    @Select
    TBatteryHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBatteryHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBatteryHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBatteryHistory entity);
}