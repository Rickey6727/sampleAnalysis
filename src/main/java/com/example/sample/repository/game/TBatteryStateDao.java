package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TBatteryState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TBatteryStateDao {

    /**
     * @param accountId
     * @return the TBatteryState entity
     */
    @Select
    TBatteryState selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBatteryState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBatteryState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBatteryState entity);
}