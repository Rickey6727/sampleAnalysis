package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TBillingHistory;
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
public interface TBillingHistoryDao {

    /**
     * @param accountId
     * @param transactionId
     * @return the TBillingHistory entity
     */
    @Select
    Optional<TBillingHistory> selectById(Integer accountId, Long transactionId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBillingHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBillingHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBillingHistory entity);
}