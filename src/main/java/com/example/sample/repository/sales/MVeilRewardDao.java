package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MVeilReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MVeilRewardDao {

    /**
     * @param gachaId
     * @return the MVeilReward entity
     */
    @Select
    MVeilReward selectById(Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MVeilReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MVeilReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MVeilReward entity);
}