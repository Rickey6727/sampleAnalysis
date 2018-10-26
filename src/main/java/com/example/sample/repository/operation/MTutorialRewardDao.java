package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTutorialReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MTutorialRewardDao {

    /**
     * @param rewardId
     * @return the MTutorialReward entity
     */
    @Select
    MTutorialReward selectById(Integer rewardId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTutorialReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTutorialReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTutorialReward entity);
}