package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TSubscriptionRecoveryStrength;
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
public interface TSubscriptionRecoveryStrengthDao {

    /**
     * @param accountId
     * @return the TSubscriptionRecoveryStrength entity
     */
    @Select
    Optional<TSubscriptionRecoveryStrength> selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSubscriptionRecoveryStrength entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSubscriptionRecoveryStrength entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSubscriptionRecoveryStrength entity);
}