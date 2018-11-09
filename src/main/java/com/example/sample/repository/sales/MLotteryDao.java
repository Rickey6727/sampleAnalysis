package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLottery;
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
public interface MLotteryDao {

    /**
     * @param lotteryId
     * @param gachaId
     * @param lotteryType
     * @return the MLottery entity
     */
    @Select
    Optional<MLottery> selectById(Integer lotteryId, Integer gachaId, Integer lotteryType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLottery entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLottery entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLottery entity);
}