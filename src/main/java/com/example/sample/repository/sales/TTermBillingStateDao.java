package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TTermBillingState;
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
public interface TTermBillingStateDao {

    /**
     * @param accountId
     * @param termType
     * @return the TTermBillingState entity
     */
    @Select
    Optional<TTermBillingState> selectById(Integer accountId, Integer termType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TTermBillingState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TTermBillingState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TTermBillingState entity);
}