package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TSubscriptionUserStatusHistory;
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
public interface TSubscriptionUserStatusHistoryDao {

    /**
     * @param accountId
     * @param createdDate
     * @return the TSubscriptionUserStatusHistory entity
     */
    @Select
    Optional<TSubscriptionUserStatusHistory> selectById(Integer accountId, LocalDateTime createdDate);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSubscriptionUserStatusHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSubscriptionUserStatusHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSubscriptionUserStatusHistory entity);
}