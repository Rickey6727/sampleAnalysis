package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLimitPurchase;
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
public interface MLimitPurchaseDao {

    /**
     * @param limitPurchaseId
     * @return the MLimitPurchase entity
     */
    @Select
    Optional<MLimitPurchase> selectById(Integer limitPurchaseId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLimitPurchase entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLimitPurchase entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLimitPurchase entity);
}