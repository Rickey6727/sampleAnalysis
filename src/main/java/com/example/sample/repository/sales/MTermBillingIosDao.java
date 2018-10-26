package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MTermBillingIos;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MTermBillingIosDao {

    /**
     * @param billingId
     * @return the MTermBillingIos entity
     */
    @Select
    MTermBillingIos selectById(Integer billingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTermBillingIos entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTermBillingIos entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTermBillingIos entity);
}