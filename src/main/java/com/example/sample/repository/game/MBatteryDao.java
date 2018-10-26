package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MBattery;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;


/**
 */
@Dao(config = DomaConfig.class)
@ConfigAutowireable
public interface MBatteryDao {

    /**
     * @param batteryId
     * @return the MBattery entity
     */
    @Select
    MBattery selectById(Integer batteryId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBattery entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBattery entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBattery entity);
}