package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TFirstPurchase;
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
public interface TFirstPurchaseDao {

    /**
     * @param firstPurchseId
     * @param accountId
     * @return the TFirstPurchase entity
     */
    @Select
    Optional<TFirstPurchase> selectById(Integer firstPurchseId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFirstPurchase entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFirstPurchase entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFirstPurchase entity);
}