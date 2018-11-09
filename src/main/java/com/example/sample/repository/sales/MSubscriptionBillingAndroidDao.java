package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MSubscriptionBillingAndroid;
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
public interface MSubscriptionBillingAndroidDao {

    /**
     * @param billingId
     * @return the MSubscriptionBillingAndroid entity
     */
    @Select
    Optional<MSubscriptionBillingAndroid> selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSubscriptionBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSubscriptionBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSubscriptionBillingAndroid entity);
}