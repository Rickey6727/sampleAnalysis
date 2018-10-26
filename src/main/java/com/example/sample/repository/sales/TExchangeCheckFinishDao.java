package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TExchangeCheckFinish;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TExchangeCheckFinishDao {

    /**
     * @param accountId
     * @param exchangeId
     * @return the TExchangeCheckFinish entity
     */
    @Select
    TExchangeCheckFinish selectById(Integer accountId, Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TExchangeCheckFinish entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TExchangeCheckFinish entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TExchangeCheckFinish entity);
}