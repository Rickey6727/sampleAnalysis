package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.SalesConfig;
import com.example.sample.entity.sales.TExchangeDataHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = SalesConfig.class)
public interface TExchangeDataHistoryDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TExchangeDataHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TExchangeDataHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TExchangeDataHistory entity);
}