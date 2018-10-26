package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MLotteryTerm;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MLotteryTermDao {

    /**
     * @param lotteryTermId
     * @return the MLotteryTerm entity
     */
    @Select
    MLotteryTerm selectById(Integer lotteryTermId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MLotteryTerm entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MLotteryTerm entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MLotteryTerm entity);
}