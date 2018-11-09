package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLimitPurchaseItem;
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
public interface MLimitPurchaseItemDao {

    /**
     * @param limitPurchaseId
     * @param itemNo
     * @return the MLimitPurchaseItem entity
     */
    @Select
    Optional<MLimitPurchaseItem> selectById(Integer limitPurchaseId, Integer itemNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLimitPurchaseItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLimitPurchaseItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLimitPurchaseItem entity);
}