package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLotteryPopItemList;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MLotteryPopItemListDao {

    /**
     * @param lotteryTermId
     * @param popType
     * @param clothesId
     * @return the MLotteryPopItemList entity
     */
    @Select
    MLotteryPopItemList selectById(Integer lotteryTermId, Integer popType, Integer clothesId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLotteryPopItemList entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLotteryPopItemList entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLotteryPopItemList entity);
}