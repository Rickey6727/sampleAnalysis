package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TFreeCoin;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TFreeCoinDao {

    /**
     * @param accountId
     * @param nativeType
     * @return the TFreeCoin entity
     */
    @Select
    TFreeCoin selectById(Integer accountId, Integer nativeType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFreeCoin entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFreeCoin entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFreeCoin entity);
}