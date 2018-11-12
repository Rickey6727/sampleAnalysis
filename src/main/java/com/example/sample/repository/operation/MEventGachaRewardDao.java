package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEventGachaReward;
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
public interface MEventGachaRewardDao {

    /**
     * @param eventId
     * @param showActionType
     * @return the MEventGachaReward entity
     */
    @Select
    Optional<MEventGachaReward> selectById(Integer eventId, Integer showActionType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEventGachaReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEventGachaReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEventGachaReward entity);
}