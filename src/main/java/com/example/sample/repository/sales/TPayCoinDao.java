package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TPayCoin;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TPayCoinDao {

    /**
     * @param accountId
     * @param nativeType
     * @return the TPayCoin entity
     */
    @Select
    TPayCoin selectById(Integer accountId, Integer nativeType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPayCoin entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPayCoin entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPayCoin entity);
}