package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TBillingMonthlyStageAccount;
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
public interface TBillingMonthlyStageAccountDao {

    /**
     * @param accountId
     * @param billingMonth
     * @param stageId
     * @return the TBillingMonthlyStageAccount entity
     */
    @Select
    Optional<TBillingMonthlyStageAccount> selectById(Integer accountId, String billingMonth, Integer stageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBillingMonthlyStageAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBillingMonthlyStageAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBillingMonthlyStageAccount entity);
}