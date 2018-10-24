package com.example.sample.repository;

import com.example.sample.entity.TDeviceChangeHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TDeviceChangeHistoryDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TDeviceChangeHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TDeviceChangeHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TDeviceChangeHistory entity);
}