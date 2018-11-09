package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TBillingAndroid;
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
public interface TBillingAndroidDao {

    /**
     * @param purchaseToken
     * @return the TBillingAndroid entity
     */
    @Select
    Optional<TBillingAndroid> selectById(String purchaseToken);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBillingAndroid entity);
}