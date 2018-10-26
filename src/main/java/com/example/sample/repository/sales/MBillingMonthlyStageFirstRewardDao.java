package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBillingMonthlyStageFirstReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MBillingMonthlyStageFirstRewardDao {

    /**
     * @param stageId
     * @param itemId
     * @param itemType
     * @return the MBillingMonthlyStageFirstReward entity
     */
    @Select
    MBillingMonthlyStageFirstReward selectById(Integer stageId, Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBillingMonthlyStageFirstReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBillingMonthlyStageFirstReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBillingMonthlyStageFirstReward entity);
}