package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBillingAndroid;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MBillingAndroidDao {

    /**
     * @param billingId
     * @return the MBillingAndroid entity
     */
    @Select
    MBillingAndroid selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBillingAndroid entity);
}