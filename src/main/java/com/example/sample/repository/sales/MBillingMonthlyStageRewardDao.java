package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBillingMonthlyStageReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MBillingMonthlyStageRewardDao {

    /**
     * @param billingMonth
     * @param stageId
     * @param itemId
     * @param itemType
     * @return the MBillingMonthlyStageReward entity
     */
    @Select
    MBillingMonthlyStageReward selectById(String billingMonth, Integer stageId, Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBillingMonthlyStageReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBillingMonthlyStageReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBillingMonthlyStageReward entity);
}