package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TEventCoinHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface TEventCoinHistoryDao {

    /**
     * @param serialId
     * @return the TEventCoinHistory entity
     */
    @Select
    Optional<TEventCoinHistory> selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TEventCoinHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TEventCoinHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TEventCoinHistory entity);
}