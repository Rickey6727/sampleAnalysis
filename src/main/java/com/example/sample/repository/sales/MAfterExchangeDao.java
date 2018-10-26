package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MAfterExchange;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MAfterExchangeDao {

    /**
     * @param afterExchangeId
     * @param no
     * @param probabilityNo
     * @return the MAfterExchange entity
     */
    @Select
    MAfterExchange selectById(Integer afterExchangeId, Integer no, Integer probabilityNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MAfterExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MAfterExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MAfterExchange entity);
}