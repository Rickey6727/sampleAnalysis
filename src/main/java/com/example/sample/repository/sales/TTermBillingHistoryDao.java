package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TTermBillingHistory;
import java.time.LocalDateTime;
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
public interface TTermBillingHistoryDao {

    /**
     * @param accountId
     * @param earnedDate
     * @return the TTermBillingHistory entity
     */
    @Select
    Optional<TTermBillingHistory> selectById(Integer accountId, LocalDateTime earnedDate);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TTermBillingHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TTermBillingHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TTermBillingHistory entity);
}