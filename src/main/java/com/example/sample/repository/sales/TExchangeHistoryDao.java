package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TExchangeHistory;
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
public interface TExchangeHistoryDao {

    /**
     * @param id
     * @param exchangeId
     * @param accountId
     * @return the TExchangeHistory entity
     */
    @Select
    Optional<TExchangeHistory> selectById(Integer id, Integer exchangeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TExchangeHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TExchangeHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TExchangeHistory entity);
}