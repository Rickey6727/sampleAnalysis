package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBillingIos;
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
public interface MBillingIosDao {

    /**
     * @param billingId
     * @return the MBillingIos entity
     */
    @Select
    Optional<MBillingIos> selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBillingIos entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBillingIos entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBillingIos entity);
}