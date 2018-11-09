package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MTermBillingAndroid;
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
public interface MTermBillingAndroidDao {

    /**
     * @param billingId
     * @return the MTermBillingAndroid entity
     */
    @Select
    Optional<MTermBillingAndroid> selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTermBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTermBillingAndroid entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTermBillingAndroid entity);
}