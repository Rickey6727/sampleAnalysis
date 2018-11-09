package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLotteryInside;
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
public interface MLotteryInsideDao {

    /**
     * @param lotteryId
     * @param lotteryNo
     * @return the MLotteryInside entity
     */
    @Select
    Optional<MLotteryInside> selectById(Integer lotteryId, Integer lotteryNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLotteryInside entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLotteryInside entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLotteryInside entity);
}