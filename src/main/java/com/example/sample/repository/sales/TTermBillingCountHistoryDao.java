package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TTermBillingCountHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
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