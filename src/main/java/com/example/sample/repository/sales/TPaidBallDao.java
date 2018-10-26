package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TPaidBall;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TPaidBallDao {

    /**
     * @param accountId
     * @return the TPaidBall entity
     */
    @Select
    TPaidBall selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPaidBall entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPaidBall entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPaidBall entity);
}