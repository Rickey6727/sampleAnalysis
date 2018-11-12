package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TBillingHistoryAndroid;
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
public interface TBillingHistoryAndroidDao {

    /**
     * @param accountId
     * @param purchaseToken
     * @return the TBillingHistoryAndroid entity
     */
    @Select
    Optional<TBillingHistoryAndroid> selectById(Integer accountId, String purchaseToken);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBillingHistoryAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBillingHistoryAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBillingHistoryAndroid entity);
}