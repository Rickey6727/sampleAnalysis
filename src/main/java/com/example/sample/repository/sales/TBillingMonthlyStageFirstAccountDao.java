package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TBillingMonthlyStageFirstAccount;
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
public interface TBillingMonthlyStageFirstAccountDao {

    /**
     * @param accountId
     * @param stageId
     * @return the TBillingMonthlyStageFirstAccount entity
     */
    @Select
    Optional<TBillingMonthlyStageFirstAccount> selectById(Integer accountId, Integer stageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBillingMonthlyStageFirstAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBillingMonthlyStageFirstAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBillingMonthlyStageFirstAccount entity);
}