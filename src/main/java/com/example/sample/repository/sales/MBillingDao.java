package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBilling;
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
public interface MBillingDao {

    /**
     * @param billingId
     * @return the MBilling entity
     */
    @Select
    Optional<MBilling> selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBilling entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBilling entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBilling entity);
}