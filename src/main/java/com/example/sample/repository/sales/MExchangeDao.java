package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MExchange;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MExchangeDao {

    /**
     * @param exchangeId
     * @return the MExchange entity
     */
    @Select
    MExchange selectById(Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MExchange entity);
}