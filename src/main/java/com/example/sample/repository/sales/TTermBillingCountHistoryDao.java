package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.SalesConfig;
import com.example.sample.entity.sales.TTermBillingCountHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = SalesConfig.class)
public interface TTermBillingCountHistoryDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TTermBillingCountHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TTermBillingCountHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TTermBillingCountHistory entity);
}