package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLotteryInsideSelectBoxRandom;
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
public interface MLotteryInsideSelectBoxRandomDao {

    /**
     * @param lotteryId
     * @param clothesId
     * @return the MLotteryInsideSelectBoxRandom entity
     */
    @Select
    Optional<MLotteryInsideSelectBoxRandom> selectById(Integer lotteryId, Integer clothesId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLotteryInsideSelectBoxRandom entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLotteryInsideSelectBoxRandom entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLotteryInsideSelectBoxRandom entity);
}