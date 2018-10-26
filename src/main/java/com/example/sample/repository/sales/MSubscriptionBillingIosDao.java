package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MSubscriptionBillingIos;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSubscriptionBillingIosDao {

    /**
     * @param billingId
     * @return the MSubscriptionBillingIos entity
     */
    @Select
    MSubscriptionBillingIos selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSubscriptionBillingIos entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSubscriptionBillingIos entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSubscriptionBillingIos entity);
}