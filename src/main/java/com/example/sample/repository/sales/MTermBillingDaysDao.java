package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MTermBillingDays;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MTermBillingDaysDao {

    /**
     * @param termType
     * @param day
     * @return the MTermBillingDays entity
     */
    @Select
    MTermBillingDays selectById(Integer termType, Integer day);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTermBillingDays entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTermBillingDays entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTermBillingDays entity);
}