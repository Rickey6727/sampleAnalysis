package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TBeginnerBilling;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TBeginnerBillingDao {

    /**
     * @param accountId
     * @return the TBeginnerBilling entity
     */
    @Select
    TBeginnerBilling selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBeginnerBilling entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBeginnerBilling entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBeginnerBilling entity);
}