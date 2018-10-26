package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MFirstPurchase;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MFirstPurchaseDao {

    /**
     * @param firstPurchaseId
     * @return the MFirstPurchase entity
     */
    @Select
    MFirstPurchase selectById(Integer firstPurchaseId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MFirstPurchase entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MFirstPurchase entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MFirstPurchase entity);
}