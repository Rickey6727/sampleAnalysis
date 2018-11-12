package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBillingMonthlyStage;
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
public interface MBillingMonthlyStageDao {

    /**
     * @param billingMonth
     * @param stageId
     * @return the MBillingMonthlyStage entity
     */
    @Select
    Optional<MBillingMonthlyStage> selectById(String billingMonth, Integer stageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBillingMonthlyStage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBillingMonthlyStage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBillingMonthlyStage entity);
}