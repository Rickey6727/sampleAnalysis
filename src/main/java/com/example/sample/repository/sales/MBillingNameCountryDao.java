package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBillingNameCountry;
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
public interface MBillingNameCountryDao {

    /**
     * @param billingId
     * @param countryCd
     * @return the MBillingNameCountry entity
     */
    @Select
    Optional<MBillingNameCountry> selectById(Integer billingId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBillingNameCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBillingNameCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBillingNameCountry entity);
}