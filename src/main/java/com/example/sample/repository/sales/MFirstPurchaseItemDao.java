package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MFirstPurchaseItem;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MFirstPurchaseItemDao {

    /**
     * @param firstPurchaseId
     * @param itemNo
     * @return the MFirstPurchaseItem entity
     */
    @Select
    MFirstPurchaseItem selectById(Integer firstPurchaseId, Integer itemNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MFirstPurchaseItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MFirstPurchaseItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MFirstPurchaseItem entity);
}