package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TRubyPointExchangeResult;
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
public interface TRubyPointExchangeResultDao {

    /**
     * @param accountId
     * @param gachaId
     * @param exchangeId
     * @return the TRubyPointExchangeResult entity
     */
    @Select
    Optional<TRubyPointExchangeResult> selectById(Integer accountId, Integer gachaId, Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRubyPointExchangeResult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRubyPointExchangeResult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRubyPointExchangeResult entity);
}